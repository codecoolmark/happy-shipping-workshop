const backendUrl = new URL(import.meta.env.VITE_BACKEND_URL)

function endpoint(endpoint) {
    return new URL(endpoint, backendUrl)
}

export async function loadPackages() {
    const response = await fetch(endpoint("/packages"))
    return await response.json()
}