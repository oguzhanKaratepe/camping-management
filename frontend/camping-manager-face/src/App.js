import logo from './logo.svg';
import './App.css';
import * as React from 'react';
import Container from './main/Container';
import { BrowserRouter as Router } from 'react-router-dom';

function App() {
  return (
    <Router>
      <Container />
    </Router>
  );
}

export default App;
