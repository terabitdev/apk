package io.elevenlabs.readerapp.ui.delegates;

import fr.d0;
import fr.g0;
import fr.k1;
import fr.z;
import ho.a;
import io.elevenlabs.domain.services.AudioPreviewService;
import ir.b2;
import ir.j1;
import ir.l1;
import ir.r;
import ir.z1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lfr/d0;", "scope", "Lfr/z;", "dispatcher", "<init>", "(Lio/elevenlabs/domain/services/AudioPreviewService;Lfr/d0;Lfr/z;)V", "", "readId", "url", "Lkotlin/Function0;", "Lsn/z;", "onStart", "toggle", "(Ljava/lang/String;Ljava/lang/String;Lho/a;)V", "stop", "()V", "Lio/elevenlabs/domain/services/AudioPreviewService;", "Lfr/d0;", "Lfr/z;", "Lfr/k1;", "previewJob", "Lfr/k1;", "Lir/j1;", "_playingReadId", "Lir/j1;", "Lir/z1;", "playingReadId", "Lir/z1;", "getPlayingReadId", "()Lir/z1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AudioPreviewPlayback {
    public static final int $stable = 8;
    private final j1 _playingReadId;
    private final AudioPreviewService audioPreviewService;
    private final z dispatcher;
    private final z1 playingReadId;
    private k1 previewJob;
    private final d0 scope;

    public AudioPreviewPlayback(AudioPreviewService audioPreviewService, d0 d0Var, z zVar) {
        audioPreviewService.getClass();
        d0Var.getClass();
        zVar.getClass();
        this.audioPreviewService = audioPreviewService;
        this.scope = d0Var;
        this.dispatcher = zVar;
        b2 c5 = r.c(null);
        this._playingReadId = c5;
        this.playingReadId = new l1(c5);
    }

    public static /* synthetic */ void toggle$default(AudioPreviewPlayback audioPreviewPlayback, String str, String str2, a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        audioPreviewPlayback.toggle(str, str2, aVar);
    }

    public final z1 getPlayingReadId() {
        return this.playingReadId;
    }

    public final void stop() {
        k1 k1Var = this.previewJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.previewJob = null;
        this._playingReadId.setValue(null);
    }

    public final void toggle(String readId, String url, a onStart) {
        readId.getClass();
        url.getClass();
        if (m.c(this._playingReadId.getValue(), readId)) {
            stop();
            return;
        }
        stop();
        if (onStart != null) {
            onStart.invoke();
        }
        this._playingReadId.setValue(readId);
        this.previewJob = g0.D(this.scope, this.dispatcher, null, new AudioPreviewPlayback$toggle$1(this, url, readId, null), 2);
    }
}
