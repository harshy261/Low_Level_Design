#include<iostream>
using namespace std;

class Command {
    public:
    virtual void execute() = 0;
    //destructor handle krlena 
};

class BreakMechanism {
    public:
    void applyBreak() {
        cout << "Break apply ho rhi hai, ohhh Wow hogyi, ohooo rukgyi" << endl;
    }
};

class AirMechansim {
    public:
    void liftSuspension() {
        cout << "Lift ho rhi hai, ohhh Wow hogyi, ohooo rukgyi" << endl;
    }
};

class AirCommand: public Command {
    private:
    AirMechansim* airMechanism;
    public:

    AirCommand(AirMechansim* airSuspension) {
        this->airMechanism = airSuspension;
    }

    void execute() {
        airMechanism->liftSuspension();
    }
};

class BreakCommand: public Command {
    private:
    BreakMechanism* breakMechanism;
    public:

    BreakCommand(BreakMechanism* breakMech) {
        this->breakMechanism = breakMech;
    }

    void execute() {
        breakMechanism->applyBreak();
    }
};

class Panel {
    private:
    Command* commands[5];
    public:
    Panel() {

    }

    void setCommand(int index, Command* cmd) {
        commands[index] = cmd;
    }

    void liftSuspension() {
        commands[0]->execute();
    }

    void applyBreak() {
        commands[1]->execute();
    }

};


int main() {

    BreakMechanism* breakMechanism = new BreakMechanism();
    AirMechansim* airMechanism = new AirMechansim();

    BreakCommand* breakCmd = new BreakCommand(breakMechanism);
    AirCommand* airCmd = new AirCommand(airMechanism);

    Panel panel;

    panel.setCommand(0, airCmd);
    panel.setCommand(1,breakCmd);

    ////try different buttons

    //panel.applyBreak();
    panel.liftSuspension();




    return 0;
}