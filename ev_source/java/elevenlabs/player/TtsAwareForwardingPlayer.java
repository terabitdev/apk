package io.elevenlabs.player;

import com.google.firebase.crashlytics.internal.metadata.h;
import ho.l;
import io.elevenlabs.domain.model.TtsTimeConversion;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import no.i;
import w7.d1;
import w7.h1;
import w7.y;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\"\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0016\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\fR\"\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\f¨\u0006,"}, d2 = {"Lio/elevenlabs/player/TtsAwareForwardingPlayer;", "Lw7/y;", "Lw7/h1;", "player", "Lkotlin/Function1;", "", "Lsn/z;", "onTtsSeek", "<init>", "(Lw7/h1;Lho/l;)V", "positionMs", "handleTtsSeek", "(J)V", "getDuration", "()J", "getCurrentPosition", "getBufferedPosition", "getContentDuration", "getContentPosition", "getContentBufferedPosition", "", "isCurrentMediaItemSeekable", "()Z", "Lw7/d1;", "getAvailableCommands", "()Lw7/d1;", "isCurrentMediaItemDynamic", "isCurrentMediaItemLive", "seekTo", "", "mediaItemIndex", "(IJ)V", "Lho/l;", "isTts", "Z", "setTts", "(Z)V", "totalCharCount", "J", "getTotalCharCount", "setTotalCharCount", "currentCharOffset", "getCurrentCharOffset", "setCurrentCharOffset", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TtsAwareForwardingPlayer extends y {
    private volatile long currentCharOffset;
    private volatile boolean isTts;
    private final l onTtsSeek;
    private volatile long totalCharCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsAwareForwardingPlayer(h1 h1Var, l lVar) {
        super(h1Var);
        h1Var.getClass();
        lVar.getClass();
        this.onTtsSeek = lVar;
    }

    private final void handleTtsSeek(long positionMs) {
        long p10 = ae.l.p(TtsTimeConversion.INSTANCE.msToChars(positionMs), new i(0L, this.totalCharCount));
        this.currentCharOffset = p10;
        this.onTtsSeek.invoke(Long.valueOf(p10));
    }

    @Override // w7.y, w7.h1
    public d1 getAvailableCommands() {
        d1 availableCommands = super.getAvailableCommands();
        availableCommands.getClass();
        if (this.isTts && !availableCommands.a(5)) {
            h hVar = new h(7);
            hVar.g(availableCommands.f36316a);
            hVar.b(5);
            return new d1(hVar.o());
        }
        return availableCommands;
    }

    @Override // w7.y, w7.h1
    public long getBufferedPosition() {
        if (this.isTts) {
            return getCurrentPosition();
        }
        return super.getBufferedPosition();
    }

    @Override // w7.y, w7.h1
    public long getContentBufferedPosition() {
        if (this.isTts) {
            return getBufferedPosition();
        }
        return super.getContentBufferedPosition();
    }

    @Override // w7.y, w7.h1
    public long getContentDuration() {
        if (this.isTts) {
            return getDuration();
        }
        return super.getContentDuration();
    }

    @Override // w7.y, w7.h1
    public long getContentPosition() {
        if (this.isTts) {
            return getCurrentPosition();
        }
        return super.getContentPosition();
    }

    public final long getCurrentCharOffset() {
        return this.currentCharOffset;
    }

    @Override // w7.y, w7.h1
    public long getCurrentPosition() {
        if (this.isTts) {
            return TtsTimeConversion.INSTANCE.charsToMs(this.currentCharOffset);
        }
        return super.getCurrentPosition();
    }

    @Override // w7.y, w7.h1
    public long getDuration() {
        if (this.isTts) {
            return TtsTimeConversion.INSTANCE.charsToMs(this.totalCharCount);
        }
        return super.getDuration();
    }

    public final long getTotalCharCount() {
        return this.totalCharCount;
    }

    @Override // w7.y, w7.h1
    public boolean isCurrentMediaItemDynamic() {
        if (this.isTts) {
            return false;
        }
        return super.isCurrentMediaItemDynamic();
    }

    @Override // w7.y, w7.h1
    public boolean isCurrentMediaItemLive() {
        if (this.isTts) {
            return false;
        }
        return super.isCurrentMediaItemLive();
    }

    @Override // w7.y, w7.h1
    public boolean isCurrentMediaItemSeekable() {
        if (this.isTts) {
            return true;
        }
        return super.isCurrentMediaItemSeekable();
    }

    /* renamed from: isTts, reason: from getter */
    public final boolean getIsTts() {
        return this.isTts;
    }

    @Override // w7.y, w7.h1
    public void seekTo(long positionMs) {
        if (!this.isTts) {
            super.seekTo(positionMs);
        } else {
            handleTtsSeek(positionMs);
        }
    }

    public final void setCurrentCharOffset(long j4) {
        this.currentCharOffset = j4;
    }

    public final void setTotalCharCount(long j4) {
        this.totalCharCount = j4;
    }

    public final void setTts(boolean z6) {
        this.isTts = z6;
    }

    @Override // w7.y, w7.h1
    public void seekTo(int mediaItemIndex, long positionMs) {
        if (!this.isTts) {
            super.seekTo(mediaItemIndex, positionMs);
        } else {
            handleTtsSeek(positionMs);
        }
    }
}
