
function userProfileUI ({user}){
    return (
        <div>
            <p>Name: {user.name}</p>
            <p>Email: {user.email}</p>
            {/* More user details */}
        </div>
    )
}
export default userProfileUI;