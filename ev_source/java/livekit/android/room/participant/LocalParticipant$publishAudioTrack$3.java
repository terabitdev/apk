package io.livekit.android.room.participant;

import as.d9;
import as.jb;
import ho.l;
import io.livekit.android.room.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Las/jb;", "Lsn/z;", "invoke", "(Las/jb;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishAudioTrack$3 extends n implements l {
    final /* synthetic */ AudioTrackPublishOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishAudioTrack$3(AudioTrackPublishOptions audioTrackPublishOptions) {
        super(1);
        this.$options = audioTrackPublishOptions;
    }

    public final void invoke(jb jbVar) {
        d9 d9Var;
        jbVar.getClass();
        jbVar.h(!this.$options.getDtx());
        jbVar.i(!this.$options.getRed());
        jbVar.b(this.$options.getFeaturesList$livekit_android_sdk_release());
        Track.Source source = this.$options.getSource();
        if (source == null || (d9Var = source.toProto()) == null) {
            d9Var = d9.MICROPHONE;
        }
        jbVar.o(d9Var);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((jb) obj);
        return z.f31622a;
    }
}
