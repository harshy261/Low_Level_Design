#ifndef FORTUNERBUILDER_H
#define FORTUNERBUILDER_H

#include "ICarBuilder.h"
#include "Fortuner.h"
#include <iostream>

class FortunerBuilder : public ICarBuilder
{
    Fortuner *s1;

public:
    FortunerBuilder() : s1(new Fortuner()) {}
    ~FortunerBuilder() override { delete s1; }

    void buildEngine() override
    {
        std::cout << "Fortuner Engine getting inserted" << std::endl;
    }

    void buildChassis() override
    {
        std::cout << "Fortuner Chassis getting inserted" << std::endl;
    }

    void buildTyre() override
    {
        std::cout << "Fortuner Tyre getting inserted" << std::endl;
    }

    void buildBodyShell() override
    {
        std::cout << "Fortuner Body getting inserted" << std::endl;
    }

    ICar *build() override
    {
        // if (engineNeeded)
        {
            this->buildEngine();
        }
        // if (tyreNeeded)
        {
            this->buildTyre();
        }
        this->buildChassis();
        // if (bodyNeeded)
        {
            this->buildBodyShell();
        }
        return s1;
    }
};

#endif
