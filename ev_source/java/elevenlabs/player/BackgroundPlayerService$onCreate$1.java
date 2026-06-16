package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.PlaybackSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.player.consumption.ConsumptionCoordinator;
import io.elevenlabs.player.consumption.ConsumptionPlayerListenerKt;
import io.elevenlabs.player.consumption.SpanMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import w7.r0;
import w7.u0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$onCreate$1", f = "BackgroundPlayerService.kt", l = {289, 291}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/player/consumption/ConsumptionCoordinator$SnapshotData;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$onCreate$1 extends i implements l {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$onCreate$1$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/player/consumption/ConsumptionCoordinator$SnapshotData;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/player/consumption/ConsumptionCoordinator$SnapshotData;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$onCreate$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ ReadMeta $readMeta;
        int label;
        final /* synthetic */ BackgroundPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService, ReadMeta readMeta, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerService;
            this.$readMeta = readMeta;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$readMeta, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super ConsumptionCoordinator.SnapshotData> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            k currentPlaybackSnapshot;
            int currentWindowIndex;
            String str;
            boolean z6;
            PlaybackSource resolvePlaybackSource;
            float playbackSpeed;
            u0 u0Var;
            Bundle bundle;
            String voiceId;
            if (this.label == 0) {
                sn.a.g(obj);
                currentPlaybackSnapshot = this.this$0.getCurrentPlaybackSnapshot(this.$readMeta);
                currentWindowIndex = this.this$0.getCurrentWindowIndex(this.$readMeta);
                r0 currentMediaItem = this.this$0.getPlayer().getCurrentMediaItem();
                if (currentMediaItem != null && (u0Var = currentMediaItem.f36581d) != null && (bundle = u0Var.J) != null && (voiceId = ExchangeKt.getVoiceId(bundle)) != null && !voiceId.equals(EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                    str = voiceId;
                } else {
                    str = null;
                }
                double doubleValue = ((Number) currentPlaybackSnapshot.f31601b).doubleValue();
                String str2 = (String) currentPlaybackSnapshot.f31600a;
                if (this.$readMeta.getAudioType() == AudioType.MEDIA) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                AudioType resolveEngineAudioType = ConsumptionPlayerListenerKt.resolveEngineAudioType(z6, str);
                resolvePlaybackSource = this.this$0.resolvePlaybackSource(this.$readMeta, currentWindowIndex);
                boolean booleanValue = ((Boolean) this.this$0.getConnectivityService().getIsConnected().getValue()).booleanValue();
                playbackSpeed = this.this$0.getPlaybackSpeed();
                return new ConsumptionCoordinator.SnapshotData(doubleValue, new SpanMeta(str2, resolveEngineAudioType, resolvePlaybackSource, booleanValue, playbackSpeed, str));
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$onCreate$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$onCreate$1> cVar) {
        super(1, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new BackgroundPlayerService$onCreate$1(this.this$0, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super ConsumptionCoordinator.SnapshotData> cVar) {
        return ((BackgroundPlayerService$onCreate$1) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        String str;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
        } catch (Throwable th) {
            lVar = new sn.l(th);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return obj;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            str = this.this$0.currentReadId;
            if (str != null) {
                ReadsService readsService = this.this$0.getReadsService();
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = readsService.getRead(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        lVar = (ReadMeta) obj;
        if (lVar instanceof sn.l) {
            lVar = null;
        }
        ReadMeta readMeta = (ReadMeta) lVar;
        if (readMeta != null) {
            fr.z main = this.this$0.getDispatcherFactory().getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, readMeta, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object Q = g0.Q(main, anonymousClass1, this);
            if (Q == aVar) {
                return aVar;
            }
            return Q;
        }
        return null;
    }
}
