import React, { useState, useEffect } from 'react';
import {userFetcher} from "./useUserFetcher";
import userProfileUI from "./userProfileUI";
function UserProfile() {
    const {user,loading,error} = userFetcher(1);
    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;
    return (
        <div>
            <h1>User Profile</h1>
            {user && (<userProfileUI user ={user}/>)}
        </div>
    );
}
export default UserProfile;