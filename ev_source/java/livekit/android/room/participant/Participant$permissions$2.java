package io.livekit.android.room.participant;

import ho.p;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.ParticipantEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/livekit/android/room/participant/ParticipantPermission;", "newPermissions", "oldPermissions", "Lsn/z;", "invoke", "(Lio/livekit/android/room/participant/ParticipantPermission;Lio/livekit/android/room/participant/ParticipantPermission;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Participant$permissions$2 extends n implements p {
    final /* synthetic */ Participant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Participant$permissions$2(Participant participant) {
        super(2);
        this.this$0 = participant;
    }

    public final void invoke(ParticipantPermission participantPermission, ParticipantPermission participantPermission2) {
        if (!m.c(participantPermission, participantPermission2)) {
            this.this$0.getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.ParticipantPermissionsChanged(this.this$0, participantPermission, participantPermission2), this.this$0.getScope());
        }
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ParticipantPermission) obj, (ParticipantPermission) obj2);
        return z.f31622a;
    }
}
