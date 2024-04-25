#ifndef SCORPIOBUILDER_H
#define SCORPIOBUILDER_H

#include "ICarBuilder.h"
#include "Scorpio.h"
#include <iostream>

class ScorpioBuilder : public ICarBuilder
{
    Scorpio *s1;

public:
    ScorpioBuilder() : s1(new Scorpio()) {}
    ~ScorpioBuilder() override { delete s1; }

    void buildEngine() override
    {
        std::cout << "Scorpio Engine getting inserted" << std::endl;
    }

    void buildChassis() override
    {
        std::cout << "Scorpio Chassis getting inserted" << std::endl;
    }

    void buildTyre() override
    {
        std::cout << "Scorpio Tyre getting inserted" << std::endl;
    }

    void buildBodyShell() override
    {
        std::cout << "Scorpio Body getting inserted" << std::endl;
    }

    ICar *build() override
    {
        std::cout << "Scorpio ready, take it away" << std::endl;
        return s1;
    }
};

#endif
