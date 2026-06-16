package io.elevenlabs.data.services;

import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.services.player.AudioPositionUpdate;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import io.elevenlabs.domain.services.player.PlayerSeekObserver;
import ir.i1;
import ir.j1;
import ir.k1;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/elevenlabs/data/services/PlayerSeekMediator;", "Lio/elevenlabs/domain/services/player/PlayerSeekEmitter;", "Lio/elevenlabs/domain/services/player/PlayerSeekObserver;", "<init>", "()V", "", "position", "Lsn/z;", "emit", "(JLwn/c;)Ljava/lang/Object;", "", "positionSeconds", "Lio/elevenlabs/domain/model/Chapter;", "currentChapter", "updateAudioPositionWithChapter", "(DLio/elevenlabs/domain/model/Chapter;)V", "", "isSeeking", "setIsSeeking", "(Z)V", "Lir/i;", "observe", "()Lir/i;", "Lio/elevenlabs/domain/services/player/AudioPositionUpdate;", "audioPositionWithChapterFlow", "Lir/i1;", "flow", "Lir/i1;", "audioPositionWithChapterFlowInternal", "Lir/j1;", "isSeekingFlow", "Lir/j1;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerSeekMediator implements PlayerSeekEmitter, PlayerSeekObserver {
    private final i1 flow = r.b(0, 1, null, 5);
    private final i1 audioPositionWithChapterFlowInternal = r.b(0, 1, null, 5);
    private final j1 isSeekingFlow = r.c(Boolean.FALSE);

    @Override // io.elevenlabs.domain.services.player.PlayerSeekObserver
    public ir.i audioPositionWithChapterFlow() {
        return new k1(this.audioPositionWithChapterFlowInternal);
    }

    @Override // io.elevenlabs.domain.services.player.PlayerSeekEmitter
    public Object emit(long j4, wn.c<? super z> cVar) {
        Object emit = this.flow.emit(new Long(j4), cVar);
        if (emit == xn.a.f37986a) {
            return emit;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.player.PlayerSeekObserver
    public ir.i observe() {
        return new k1(this.flow);
    }

    @Override // io.elevenlabs.domain.services.player.PlayerSeekEmitter
    public void setIsSeeking(boolean isSeeking) {
        this.isSeekingFlow.setValue(Boolean.valueOf(isSeeking));
    }

    @Override // io.elevenlabs.domain.services.player.PlayerSeekEmitter
    public void updateAudioPositionWithChapter(double positionSeconds, Chapter currentChapter) {
        if (!((Boolean) this.isSeekingFlow.getValue()).booleanValue()) {
            this.audioPositionWithChapterFlowInternal.tryEmit(new AudioPositionUpdate(positionSeconds, currentChapter));
        }
    }
}
