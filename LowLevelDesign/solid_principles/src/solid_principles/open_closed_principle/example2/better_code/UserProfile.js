
const UserProfile = ({user}) => {
    const ProfileView = UserProfileSelector.getProfile(user.role);
    return <ProfileView user={user} />
}