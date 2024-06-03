const accessToken = 'YOUR_ACCESS_TOKEN'; // Replace with your access token

async function fetchFeaturedPlaylists() {
    const response = await fetch('https://api.spotify.com/v1/browse/featured-playlists', {
        headers: {
            'Authorization': `Bearer ${accessToken}`
        }
    });
    const data = await response.json();
    return data.playlists.items;
}

async function fetchPlaylistTracks(playlistId) {
    const response = await fetch(`https://api.spotify.com/v1/playlists/${playlistId}/tracks`, {
        headers: {
            'Authorization': `Bearer ${accessToken}`
        }
    });
    const data = await response.json();
    return data.items;
}

async function getRandomSongs() {
    const playlists = await fetchFeaturedPlaylists();
    const randomPlaylist = playlists[Math.floor(Math.random() * playlists.length)];
    const tracks = await fetchPlaylistTracks(randomPlaylist.id);
    return tracks.map(track => track.track);
}

async function displayRandomSongs() {
    const songs = await getRandomSongs();
    const songList = document.getElementById('song-list');
    songList.innerHTML = '';

    songs.forEach(song => {
        const listItem = document.createElement('li');
        listItem.textContent = `${song.name} by ${song.artists.map(artist => artist.name).join(', ')}`;
        songList.appendChild(listItem);
    });
}

displayRandomSongs();
