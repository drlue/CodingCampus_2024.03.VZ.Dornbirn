window.addEventListener('scroll', () => {
    const elements = document.querySelectorAll('.fadeIn');
    const screenBottom = window.innerHeight;
    elements.forEach(el => {
      const elementTop = el.getBoundingClientRect().top;
      if (elementTop < screenBottom) {
        el.classList.add('active');
      } else {
        el.classList.remove('active');
      }
    });
  });
  