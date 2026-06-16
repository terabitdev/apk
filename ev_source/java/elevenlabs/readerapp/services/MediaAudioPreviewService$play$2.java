package io.elevenlabs.readerapp.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.services.player.PlayerService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.MediaAudioPreviewService$play$2", f = "MediaAudioPreviewService.kt", l = {47}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/elevenlabs/domain/model/PlayerConnectionState;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaAudioPreviewService$play$2 extends i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaAudioPreviewService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerConnectionState.values().length];
            try {
                iArr[PlayerConnectionState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerConnectionState.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerConnectionState.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerConnectionState.BUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerConnectionState.READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAudioPreviewService$play$2(MediaAudioPreviewService mediaAudioPreviewService, c<? super MediaAudioPreviewService$play$2> cVar) {
        super(2, cVar);
        this.this$0 = mediaAudioPreviewService;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        MediaAudioPreviewService$play$2 mediaAudioPreviewService$play$2 = new MediaAudioPreviewService$play$2(this.this$0, cVar);
        mediaAudioPreviewService$play$2.L$0 = obj;
        return mediaAudioPreviewService$play$2;
    }

    @Override // ho.p
    public final Object invoke(PlayerConnectionState playerConnectionState, c<? super Boolean> cVar) {
        return ((MediaAudioPreviewService$play$2) create(playerConnectionState, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PlayerService playerService;
        PlayerConnectionState playerConnectionState = (PlayerConnectionState) this.L$0;
        int i10 = this.label;
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            this.this$0.logger.log(this.this$0.tag, "player status: " + playerConnectionState);
            int i11 = WhenMappings.$EnumSwitchMapping$0[playerConnectionState.ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        c6.p();
                        return null;
                    }
                    this.this$0.logger.log(this.this$0.tag, "pausing");
                    playerService = this.this$0.playerService;
                    this.L$0 = null;
                    this.label = 1;
                    Object pause = playerService.pause(this);
                    xn.a aVar = xn.a.f37986a;
                    if (pause == aVar) {
                        return aVar;
                    }
                }
            } else {
                z6 = true;
            }
        }
        return Boolean.valueOf(z6);
    }
}
