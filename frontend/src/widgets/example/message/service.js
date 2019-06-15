
export default class MessageService 
{
    static list() 
    {
        return [this.get(0)];
    }

    static get(id) 
    {
        return {
            "id": 0,
            "username": "john",
            "password": "fjlkdsajlfkjsdalkfjlksdaafjvjdklf",
            "firstname": "John",
            "lastname": "Doe",
            "type": "SELLER",
            "phone": "+381631022817",
            "city":2,
            "email": "john@example.com",
            "registration_date": "2014-05-02 21:00:05"
        }; 
    }

    static create(message)
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