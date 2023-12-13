import { useEffect, useState } from 'react'
import { loadPackages } from './api'

function App() {
  const [packages, setPackages] = useState([])

  useEffect(() => {
    loadPackages().then(setPackages)
  }, [])

  return (
    <>
      <h2>Packages</h2>
      <ul>
        {packages.map((packageName, index) => <li key={index}>{packageName}</li>)}
      </ul>
    </>
  )
}

export default App
