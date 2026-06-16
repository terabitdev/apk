package io.livekit.android.room.datastream.outgoing;

import a9.a;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import io.livekit.android.room.datastream.StreamException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import sn.m;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0087@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00028\u0000H¡@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u001c\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/BaseStreamSender;", TokenNames.T, "", "Lio/livekit/android/room/datastream/outgoing/StreamDestination;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Lio/livekit/android/room/datastream/outgoing/StreamDestination;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/m;", "Lsn/z;", "write-gIAlu-s", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "write", "writeImpl-gIAlu-s$livekit_android_sdk_release", "writeImpl", "", "reason", "close", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "getDestination$livekit_android_sdk_release", "()Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "", "isOpen", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class BaseStreamSender<T> {
    private final StreamDestination<T> destination;

    public BaseStreamSender(StreamDestination<T> streamDestination) {
        streamDestination.getClass();
        this.destination = streamDestination;
    }

    public static /* synthetic */ Object close$default(BaseStreamSender baseStreamSender, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return baseStreamSender.close(str, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: close");
        return null;
    }

    public final Object close(String str, c<? super z> cVar) {
        Object close = this.destination.close(str, cVar);
        if (close == xn.a.f37986a) {
            return close;
        }
        return z.f31622a;
    }

    public final StreamDestination<T> getDestination$livekit_android_sdk_release() {
        return this.destination;
    }

    public final boolean isOpen() {
        return this.destination.isOpen();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: write-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2556writegIAlus(T t10, c<? super m> cVar) {
        BaseStreamSender$write$1 baseStreamSender$write$1;
        int i10;
        if (cVar instanceof BaseStreamSender$write$1) {
            baseStreamSender$write$1 = (BaseStreamSender$write$1) cVar;
            int i11 = baseStreamSender$write$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                baseStreamSender$write$1.label = i11 - Integer.MIN_VALUE;
                Object obj = baseStreamSender$write$1.result;
                i10 = baseStreamSender$write$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                if (!this.destination.isOpen()) {
                    return new l(new StreamException.TerminatedException(null, 1, null));
                }
                baseStreamSender$write$1.label = 1;
                Object mo2557writeImplgIAlus$livekit_android_sdk_release = mo2557writeImplgIAlus$livekit_android_sdk_release(t10, baseStreamSender$write$1);
                xn.a aVar = xn.a.f37986a;
                if (mo2557writeImplgIAlus$livekit_android_sdk_release == aVar) {
                    return aVar;
                }
                return mo2557writeImplgIAlus$livekit_android_sdk_release;
            }
        }
        baseStreamSender$write$1 = new BaseStreamSender$write$1(this, cVar);
        Object obj2 = baseStreamSender$write$1.result;
        i10 = baseStreamSender$write$1.label;
        if (i10 == 0) {
        }
    }

    /* renamed from: writeImpl-gIAlu-s$livekit_android_sdk_release, reason: not valid java name */
    public abstract Object mo2557writeImplgIAlus$livekit_android_sdk_release(T t10, c<? super m> cVar);
}
