import React, { useState, useEffect } from 'react';
import axios from 'axios';
// Is there any issue with this code ????
export const userFetcher = (id) => {
    const [data, setData] = useState({user:null,loading:true,error:''});

    useEffect(() => {
        axios.get(`/api/user/${id}`)
            .then(response => setData({...data, user: response.data}))
            .catch(error => setData({...data, error : 'Error fetching user data'}))
            .finally(() => setData({...data,loading: false}));
    }, []);
    return data;
}