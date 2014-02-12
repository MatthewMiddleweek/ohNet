#ifndef HEADER_STANDARD
#define HEADER_STANDARD

#include <OpenHome/OhNetTypes.h>
#include <OpenHome/Exception.h>

EXCEPTION(AssertionFailed)

#define ASSERT(x)                             \
    if(!(x)) {                                \
        OpenHome::CallAssertHandler(__FILE__,__LINE__); \
    }

#define ASSERTS()  OpenHome::CallAssertHandler(__FILE__,__LINE__)

#ifdef DEFINE_DEBUG
# define ASSERT_DEBUG(x) ASSERT(x)
#else //DEFINE_DEBUG
# define ASSERT_DEBUG(x)
#endif //DEFINE_DEBUG

namespace OpenHome {

class INonCopyable
{
protected:
    INonCopyable() {}
private:
    INonCopyable(const INonCopyable &);
    void operator=(const INonCopyable &);
};

} // namespace OpenHome

#endif // HEADER_STANDARD
