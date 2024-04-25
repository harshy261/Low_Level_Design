#include "ScorpioBuilder.h"
#include "FortunerBuilder.h"
#include "Director.h"
#include <iostream>

int main()
{
    // ScorpioBuilder *builder = new ScorpioBuilder();
    auto builder = new FortunerBuilder();
    // Director director(builder);

    // Build process
    // director.construct(true, true, true);
    ICar *car = builder->build();

    delete builder;
    return 0;
}
