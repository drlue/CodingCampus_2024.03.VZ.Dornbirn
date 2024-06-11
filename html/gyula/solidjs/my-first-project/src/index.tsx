/* @refresh reload */
import { render } from 'solid-js/web';
import  { Route, Router } from '@solidjs/router';


import './index.css';


import Home from './Home'
import Page2 from './Page2'


const root = document.getElementById('root');

if (import.meta.env.DEV && !(root instanceof HTMLElement)) {
  throw new Error(
    'Root element not found. Did you forget to add it to your index.html? Or maybe the id attribute got misspelled?',
  );
}

render(() => <Router root={props => 
    <>
      <h1>Site Title</h1>
      {props.children}
      <div>Footer</div>
    </>
}>
        <Route path="/" component={Home} />
        <Route path="/page2" component={Page2} />
</Router>, root!);
