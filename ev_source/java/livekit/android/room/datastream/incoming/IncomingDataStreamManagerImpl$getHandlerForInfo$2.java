package io.livekit.android.room.datastream.incoming;

import et.d;
import ho.p;
import io.livekit.android.room.datastream.StreamInfo;
import io.livekit.android.room.datastream.TextStreamInfo;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhr/n;", "", "channel", "Lio/livekit/android/room/participant/Participant$Identity;", "identity", "Lsn/z;", "invoke-Fe0n8cs", "(Lhr/n;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class IncomingDataStreamManagerImpl$getHandlerForInfo$2 extends n implements p {
    final /* synthetic */ p $handler;
    final /* synthetic */ StreamInfo $info;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncomingDataStreamManagerImpl$getHandlerForInfo$2(p pVar, StreamInfo streamInfo) {
        super(2);
        this.$handler = pVar;
        this.$info = streamInfo;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m2555invokeFe0n8cs((hr.n) obj, ((Participant.Identity) obj2).m2610unboximpl());
        return z.f31622a;
    }

    /* renamed from: invoke-Fe0n8cs, reason: not valid java name */
    public final void m2555invokeFe0n8cs(hr.n nVar, String str) {
        nVar.getClass();
        str.getClass();
        p pVar = this.$handler;
        if (pVar == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            StreamInfo streamInfo = this.$info;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Received text stream for topic \"" + streamInfo.getTopic() + "\", but no handler was found. Ignoring.", new Object[0]);
                return;
            }
            return;
        }
        pVar.invoke(new TextStreamReceiver((TextStreamInfo) this.$info, nVar), Participant.Identity.m2604boximpl(str));
    }
}
