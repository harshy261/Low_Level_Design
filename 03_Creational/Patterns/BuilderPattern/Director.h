#ifndef DIRECTOR_H
#define DIRECTOR_H

#include "ICarBuilder.h"

class Director
{
    ICarBuilder *carBuilder;

public:
    Director(ICarBuilder *builder) : carBuilder(builder) {}

    void construct(bool tyreNeeded, bool engineNeeded, bool bodyNeeded)
    {
        if (engineNeeded)
        {
            carBuilder->buildEngine();
        }
        if (tyreNeeded)
        {
            carBuilder->buildTyre();
        }
        carBuilder->buildChassis();
        if (bodyNeeded)
        {
            carBuilder->buildBodyShell();
        }
    }
};

#endif
