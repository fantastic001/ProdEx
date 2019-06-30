import API_URL from "../config.js";

export default class UserService 
{
    constructor(self) 
    {
        this.self = self;
    }

    static list() 
    {
        return axios.get(API_URL + "/User/");
    }

    static get(id) 
    {
        return axios.get(API_URL + "/User/" + id);
    }

    static create(user)
    {
        return axios.post(API_URL + "/User/", user);
    }

    static update(id, data) 
    {
        return axios.post(API_URL + "/User/" + id, data);
    }

    static delete(id) 
    {
        return axios.delete(API_URL + "/User/");
    }
}