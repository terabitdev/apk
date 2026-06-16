package io.livekit.android.room.datastream.outgoing;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.room.datastream.ByteStreamInfo;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.m;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0002H\u0090@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;", "Lio/livekit/android/room/datastream/outgoing/BaseStreamSender;", "", "Lio/livekit/android/room/datastream/ByteStreamInfo;", ParameterNames.INFO, "Lio/livekit/android/room/datastream/outgoing/StreamDestination;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Lio/livekit/android/room/datastream/ByteStreamInfo;Lio/livekit/android/room/datastream/outgoing/StreamDestination;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/m;", "Lsn/z;", "writeImpl-gIAlu-s$livekit_android_sdk_release", "([BLwn/c;)Ljava/lang/Object;", "writeImpl", "Lio/livekit/android/room/datastream/ByteStreamInfo;", "getInfo", "()Lio/livekit/android/room/datastream/ByteStreamInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamSender extends BaseStreamSender<byte[]> {
    private final ByteStreamInfo info;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamSender(ByteStreamInfo byteStreamInfo, StreamDestination<byte[]> streamDestination) {
        super(streamDestination);
        byteStreamInfo.getClass();
        streamDestination.getClass();
        this.info = byteStreamInfo;
    }

    public final ByteStreamInfo getInfo() {
        return this.info;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: writeImpl-gIAlu-s$livekit_android_sdk_release, reason: avoid collision after fix types in other method and not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2558writeImplgIAlus$livekit_android_sdk_release(byte[] bArr, c<? super m> cVar) {
        ByteStreamSender$writeImpl$1 byteStreamSender$writeImpl$1;
        int i10;
        p pVar;
        if (cVar instanceof ByteStreamSender$writeImpl$1) {
            byteStreamSender$writeImpl$1 = (ByteStreamSender$writeImpl$1) cVar;
            int i11 = byteStreamSender$writeImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteStreamSender$writeImpl$1.label = i11 - Integer.MIN_VALUE;
                Object obj = byteStreamSender$writeImpl$1.result;
                i10 = byteStreamSender$writeImpl$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.g(obj);
                StreamDestination<byte[]> destination$livekit_android_sdk_release = getDestination$livekit_android_sdk_release();
                pVar = ByteStreamSenderKt.byteDataChunker;
                byteStreamSender$writeImpl$1.label = 1;
                Object mo2570write0E7RQCE = destination$livekit_android_sdk_release.mo2570write0E7RQCE(bArr, pVar, byteStreamSender$writeImpl$1);
                xn.a aVar = xn.a.f37986a;
                if (mo2570write0E7RQCE == aVar) {
                    return aVar;
                }
                return mo2570write0E7RQCE;
            }
        }
        byteStreamSender$writeImpl$1 = new ByteStreamSender$writeImpl$1(this, cVar);
        Object obj2 = byteStreamSender$writeImpl$1.result;
        i10 = byteStreamSender$writeImpl$1.label;
        if (i10 == 0) {
        }
    }

    @Override // io.livekit.android.room.datastream.outgoing.BaseStreamSender
    /* renamed from: writeImpl-gIAlu-s$livekit_android_sdk_release */
    public /* bridge */ /* synthetic */ Object mo2557writeImplgIAlus$livekit_android_sdk_release(byte[] bArr, c cVar) {
        return m2558writeImplgIAlus$livekit_android_sdk_release(bArr, (c<? super m>) cVar);
    }
}
