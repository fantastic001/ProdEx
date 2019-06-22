
export default class OrderService 
{
    static list() 
    {
        return [this.get(0)];
    }

    static get(id) 
    {
        return {
            "id": 0,
            "buyer": 0,
            "item": 0,
            "status": "SHIPPED"
        }; 
    }

    static create(order)
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
