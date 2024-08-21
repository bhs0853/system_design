const UserProfileSelector = {
    getProfile(role){
        switch (role) {
            case "admin" : return <AdminView />
            case "editor" : return <EditorView />
            default : <StandardView />

        }
    }
}