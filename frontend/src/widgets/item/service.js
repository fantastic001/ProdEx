
export default class ItemService 
{
    static list() 
    {
        return [this.get(0)];
    }

    static get(id) 
    {
        return {
            "id": 0,
            "name": "Item 1",
            "description": "This is a description",
            "image": "",
            "seller": 0, 
            price: 5,
            likes: 5,
            dislikes: 5,
            "due_date": "2014-05-02 21:00:05",
            "creation_date": "2014-05-02 21:00:05",
            city: 0,
            active: true, 
            category: 0
        }; 
    }

    static create(item)
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