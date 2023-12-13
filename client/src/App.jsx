import { useEffect, useState } from 'react'
import { loadPackages, postPackage } from './api'

function App() {
  const [packages, setPackages] = useState([])
  const [packageName, setPackageName] = useState("");

  useEffect(() => {
    loadPackages().then(setPackages)
  }, [])

  const onSubmit = async (e) => {
    e.preventDefault();
    postPackage({ name: packageName })
      .then(() => loadPackages())
      .then((packages) => {
        setPackages(packages)
        setPackageName("")
      })
  };

  return (
    <>
      <h2>Manage Packages</h2>
      <details>
        <summary>Post a package</summary>
        <form onSubmit={onSubmit}>
          <label>Package name 
            <input type="text" value={packageName} required onChange={(e) => setPackageName(e.target.value)}/>
          </label>
          <button type="submit">Ship package</button>
        </form>
      </details>
      <details>
        <summary>Packages</summary>
        <ul>
          {packages.map((packageObj, index) => <li key={index}>{packageObj.name}</li>)}
        </ul>
      </details>
    </>
  )
}

export default App
