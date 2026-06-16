package io.livekit.android.room;

import ho.p;
import io.livekit.android.audio.AudioRecordPrewarmer;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.room.Room;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/livekit/android/room/Room$State;", "new", "old", "Lsn/z;", "invoke", "(Lio/livekit/android/room/Room$State;Lio/livekit/android/room/Room$State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$state$2 extends n implements p {
    final /* synthetic */ Room this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Room.State.values().length];
            try {
                iArr[Room.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Room.State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$state$2(Room room) {
        super(2);
        this.this$0 = room;
    }

    public final void invoke(Room.State state, Room.State state2) {
        CommunicationWorkaround communicationWorkaround;
        CommunicationWorkaround communicationWorkaround2;
        AudioRecordPrewarmer audioRecordPrewarmer;
        state.getClass();
        state2.getClass();
        if (state != state2) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.this$0.getAudioHandler().stop();
                    communicationWorkaround2 = this.this$0.communicationWorkaround;
                    communicationWorkaround2.stop();
                    audioRecordPrewarmer = this.this$0.audioRecordPrewarmer;
                    audioRecordPrewarmer.stop();
                    return;
                }
                return;
            }
            this.this$0.getAudioHandler().start();
            communicationWorkaround = this.this$0.communicationWorkaround;
            communicationWorkaround.start();
        }
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Room.State) obj, (Room.State) obj2);
        return z.f31622a;
    }
}
