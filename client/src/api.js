const backendUrl = new URL(import.meta.env.VITE_BACKEND_URL)

function endpoint(endpoint) {
    return new URL(endpoint, backendUrl)
}

export async function loadPackages() {
    const response = await fetch(endpoint("/packages"))
    return await response.json()
}

export async function postPackage(packageObj) {
    const response = await fetch(endpoint("/packages"), {
        method: "post",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(packageObj)
    })
    return await response.json()
}