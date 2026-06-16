package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;", "", "readMeta", "Lio/elevenlabs/domain/model/ReadMeta;", "position", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "usedVoiceId", "", "resetToOffset", "", "passedInitialSeek", "currentChapter", "Lio/elevenlabs/domain/model/Chapter;", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;Ljava/lang/String;ZZLio/elevenlabs/domain/model/Chapter;)V", "getReadMeta", "()Lio/elevenlabs/domain/model/ReadMeta;", "getPosition", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "getUsedVoiceId", "()Ljava/lang/String;", "getResetToOffset", "()Z", "getPassedInitialSeek", "getCurrentChapter", "()Lio/elevenlabs/domain/model/Chapter;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ContentState {
    public static final int $stable = 8;
    private final Chapter currentChapter;
    private final boolean passedInitialSeek;
    private final PlaybackPosition position;
    private final ReadMeta readMeta;
    private final boolean resetToOffset;
    private final String usedVoiceId;

    public /* synthetic */ ContentState(ReadMeta readMeta, PlaybackPosition playbackPosition, String str, boolean z6, boolean z10, Chapter chapter, int i10, kotlin.jvm.internal.f fVar) {
        this(readMeta, playbackPosition, str, (i10 & 8) != 0 ? true : z6, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : chapter);
    }

    public static /* synthetic */ ContentState copy$default(ContentState contentState, ReadMeta readMeta, PlaybackPosition playbackPosition, String str, boolean z6, boolean z10, Chapter chapter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMeta = contentState.readMeta;
        }
        if ((i10 & 2) != 0) {
            playbackPosition = contentState.position;
        }
        if ((i10 & 4) != 0) {
            str = contentState.usedVoiceId;
        }
        if ((i10 & 8) != 0) {
            z6 = contentState.resetToOffset;
        }
        if ((i10 & 16) != 0) {
            z10 = contentState.passedInitialSeek;
        }
        if ((i10 & 32) != 0) {
            chapter = contentState.currentChapter;
        }
        boolean z11 = z10;
        Chapter chapter2 = chapter;
        return contentState.copy(readMeta, playbackPosition, str, z6, z11, chapter2);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMeta getReadMeta() {
        return this.readMeta;
    }

    /* renamed from: component2, reason: from getter */
    public final PlaybackPosition getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsedVoiceId() {
        return this.usedVoiceId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getResetToOffset() {
        return this.resetToOffset;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPassedInitialSeek() {
        return this.passedInitialSeek;
    }

    /* renamed from: component6, reason: from getter */
    public final Chapter getCurrentChapter() {
        return this.currentChapter;
    }

    public final ContentState copy(ReadMeta readMeta, PlaybackPosition position, String usedVoiceId, boolean resetToOffset, boolean passedInitialSeek, Chapter currentChapter) {
        readMeta.getClass();
        position.getClass();
        usedVoiceId.getClass();
        return new ContentState(readMeta, position, usedVoiceId, resetToOffset, passedInitialSeek, currentChapter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentState)) {
            return false;
        }
        ContentState contentState = (ContentState) other;
        if (kotlin.jvm.internal.m.c(this.readMeta, contentState.readMeta) && kotlin.jvm.internal.m.c(this.position, contentState.position) && kotlin.jvm.internal.m.c(this.usedVoiceId, contentState.usedVoiceId) && this.resetToOffset == contentState.resetToOffset && this.passedInitialSeek == contentState.passedInitialSeek && kotlin.jvm.internal.m.c(this.currentChapter, contentState.currentChapter)) {
            return true;
        }
        return false;
    }

    public final Chapter getCurrentChapter() {
        return this.currentChapter;
    }

    public final boolean getPassedInitialSeek() {
        return this.passedInitialSeek;
    }

    public final PlaybackPosition getPosition() {
        return this.position;
    }

    public final ReadMeta getReadMeta() {
        return this.readMeta;
    }

    public final boolean getResetToOffset() {
        return this.resetToOffset;
    }

    public final String getUsedVoiceId() {
        return this.usedVoiceId;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(j0.c.c((this.position.hashCode() + (this.readMeta.hashCode() * 31)) * 31, 31, this.usedVoiceId), 31, this.resetToOffset), 31, this.passedInitialSeek);
        Chapter chapter = this.currentChapter;
        if (chapter == null) {
            hashCode = 0;
        } else {
            hashCode = chapter.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        ReadMeta readMeta = this.readMeta;
        PlaybackPosition playbackPosition = this.position;
        String str = this.usedVoiceId;
        boolean z6 = this.resetToOffset;
        boolean z10 = this.passedInitialSeek;
        Chapter chapter = this.currentChapter;
        StringBuilder sb = new StringBuilder("ContentState(readMeta=");
        sb.append(readMeta);
        sb.append(", position=");
        sb.append(playbackPosition);
        sb.append(", usedVoiceId=");
        defpackage.f.y(sb, str, ", resetToOffset=", z6, ", passedInitialSeek=");
        sb.append(z10);
        sb.append(", currentChapter=");
        sb.append(chapter);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public ContentState(ReadMeta readMeta, PlaybackPosition playbackPosition, String str, boolean z6, boolean z10, Chapter chapter) {
        readMeta.getClass();
        playbackPosition.getClass();
        str.getClass();
        this.readMeta = readMeta;
        this.position = playbackPosition;
        this.usedVoiceId = str;
        this.resetToOffset = z6;
        this.passedInitialSeek = z10;
        this.currentChapter = chapter;
    }
}
