package io.livekit.android.room.participant;

import ho.p;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.ParticipantEvent;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "newValue", "oldValue", "Lsn/z;", "invoke", "(ZZ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Participant$isSpeaking$2 extends n implements p {
    final /* synthetic */ Participant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Participant$isSpeaking$2(Participant participant) {
        super(2);
        this.this$0 = participant;
    }

    public final void invoke(boolean z6, boolean z10) {
        if (z6 != z10) {
            ParticipantListener internalListener = this.this$0.getInternalListener();
            if (internalListener != null) {
                internalListener.onSpeakingChanged(this.this$0);
            }
            this.this$0.getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.SpeakingChanged(this.this$0, z6), this.this$0.getScope());
            if (z6) {
                this.this$0.setLastSpokeAt$livekit_android_sdk_release(Long.valueOf(new Date().getTime()));
            }
        }
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        return z.f31622a;
    }
}
