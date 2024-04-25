#ifndef ICARBUILDER_H
#define ICARBUILDER_H

#include "ICar.h"

class ICarBuilder
{
public:
    virtual ~ICarBuilder() {}

    virtual void buildEngine() = 0;
    virtual void buildChassis() = 0;
    virtual void buildTyre() = 0;
    virtual void buildBodyShell() = 0;
    virtual ICar *build() = 0;
};

#endif
