#include <OpenHome/Net/C/OhNet.h>
#include <OpenHome/Net/Core/OhNet.h>

using namespace OpenHome;
using namespace OpenHome::Net;

void STDCALL OhNetLibraryStartCombined(TIpAddress aSubnet)
{
    UpnpLibrary::StartCombined(aSubnet);
}