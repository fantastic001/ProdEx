
export default class SellerService 
{
    static list() 
    {
        return [this.get(0)];
    }

    static get(id) 
    {
        return {
            "id": 0,
            "user": 0
        }; 
    }

    static create(seller)
    {
        return {"status": "ok"};
    }

    static update(id, data) 
    {
        return {"status": "ok"};
    }

    static delete(id) 
    {
        return {"status": "ok"};
    }
}