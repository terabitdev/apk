package io.livekit.android.room.track;

import com.google.protobuf.c6;
import ho.q;
import io.livekit.android.audio.AudioProcessorInterface;
import kotlin.Metadata;
import sn.k;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.track.LocalAudioTrack$features$4", f = "LocalAudioTrack.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/livekit/android/audio/AudioProcessorInterface;", "processor", "", "bypass", "Lsn/k;", "<anonymous>", "(Lio/livekit/android/audio/AudioProcessorInterface;Z)Lsn/k;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalAudioTrack$features$4 extends i implements q {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public LocalAudioTrack$features$4(c<? super LocalAudioTrack$features$4> cVar) {
        super(3, cVar);
    }

    public final Object invoke(AudioProcessorInterface audioProcessorInterface, boolean z6, c<? super k> cVar) {
        LocalAudioTrack$features$4 localAudioTrack$features$4 = new LocalAudioTrack$features$4(cVar);
        localAudioTrack$features$4.L$0 = audioProcessorInterface;
        localAudioTrack$features$4.Z$0 = z6;
        return localAudioTrack$features$4.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            return new k((AudioProcessorInterface) this.L$0, Boolean.valueOf(this.Z$0));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((AudioProcessorInterface) obj, ((Boolean) obj2).booleanValue(), (c<? super k>) obj3);
    }
}
