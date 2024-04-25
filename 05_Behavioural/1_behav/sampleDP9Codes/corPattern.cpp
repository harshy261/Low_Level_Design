#include<iostream>
using namespace std;

class AbstractRequest{
    protected: int requestCode;

    public:
    AbstractRequest(int code) {
        this->requestCode = code;
    }

    int getRequestCode() {
        return requestCode;
    }

    //destructor pending 
};

class PressureIssueRequest: public AbstractRequest {
    public:
    PressureIssueRequest(): AbstractRequest(303) {       }
};

class EngineIssueRequest: public AbstractRequest {
    public:
    EngineIssueRequest(): AbstractRequest(302){};
};
//Now, I need to create HANDLER

class AbstractHandler{
    protected: AbstractHandler* nextHandler;

    AbstractHandler(AbstractHandler* next) {
        nextHandler = next;
    }

    virtual void handleRequest(AbstractRequest* request) {
        if(nextHandler != nullptr) {
            nextHandler->handleRequest(request);
        }
    }
};

class PressureIssueHandler: public AbstractHandler {

    static const int code = 303;

    public:
    PressureIssueHandler(AbstractHandler* successor): AbstractHandler(successor){}

    void handleRequest(AbstractRequest* request) {
        if(request->getRequestCode() == code) {
            cout << "Pressure handler is handling the request" << endl;
        }
        else {
            AbstractHandler::handleRequest(request);
        }
    }
};


class EngineIssueHandler: public AbstractHandler {

    static const int code = 302;

    public:
    EngineIssueHandler(AbstractHandler* successor): AbstractHandler(successor){}

    void handleRequest(AbstractRequest* request) {
        if(request->getRequestCode() == code) {
            cout << "EngineIssueHandler  is handling the request" << endl;
        }
        else {
            AbstractHandler::handleRequest(request);
        }
    }
};


int main() {

    //create chain
    PressureIssueHandler* pressureHandler = new PressureIssueHandler(nullptr);
    EngineIssueHandler* engineHandler = new EngineIssueHandler(pressureHandler);


    //create request
    PressureIssueRequest* pressureRequest = new PressureIssueRequest();

    //handle request
    engineHandler->handleRequest(pressureRequest);

    //calll destructor

    return 0;
}