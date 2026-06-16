package io.livekit.android.room.datastream.outgoing;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JN\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00028\u00002(\u0010\t\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0000`\bH§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/StreamDestination;", TokenNames.T, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function2;", "", "", "", "Lio/livekit/android/room/datastream/outgoing/DataChunker;", "chunker", "Lsn/m;", "Lsn/z;", "write-0E7RQCE", "(Ljava/lang/Object;Lho/p;Lwn/c;)Ljava/lang/Object;", "write", "", "reason", "close", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "isOpen", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface StreamDestination<T> {
    Object close(String str, c<? super z> cVar);

    boolean isOpen();

    /* renamed from: write-0E7RQCE */
    Object mo2570write0E7RQCE(T t10, p pVar, c<? super m> cVar);
}
