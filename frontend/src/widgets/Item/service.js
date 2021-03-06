import { API_URL } from "./../../config";
import axios from "axios"

export default class ItemService 
{
    constructor(self) 
    {
        this.self = self;
    }

    static list() 
    {
        return axios.get(API_URL + "/Item/");
    }

    static get(id) 
    {
        return axios.get(API_URL + "/Item/" + id);
    }
    
    static getStatus(id) 
    {
        return axios.get(API_URL + "/Item/" + id + "/status");
    }
    static sendMessage(id, message) 
    {
        return axios.post(API_URL + "/Item/" + id + "/message");
    }
    static updateStatus(id) 
    {
        return axios.post(API_URL + "/Item/" + id + "/status");
    }

    static create(x)
    {
        return axios.post(API_URL + "/Item/", x);
    }

    static update(id, data) 
    {
        return axios.post(API_URL + "/Item/" + id, data);
    }

    static delete(id) 
    {
        return axios.delete(API_URL + "/Item/" + id);
    }
}
