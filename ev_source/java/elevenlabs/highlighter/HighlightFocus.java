package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Chapter;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/highlighter/HighlightFocus;", "", "None", "ActiveElement", "Lio/elevenlabs/highlighter/HighlightFocus$ActiveElement;", "Lio/elevenlabs/highlighter/HighlightFocus$None;", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface HighlightFocus {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/highlighter/HighlightFocus$ActiveElement;", "Lio/elevenlabs/highlighter/HighlightFocus;", "chapter", "Lio/elevenlabs/domain/model/Chapter;", "elementIndex", "", "position", "Lio/elevenlabs/highlighter/HighlighterPosition;", "<init>", "(Lio/elevenlabs/domain/model/Chapter;ILio/elevenlabs/highlighter/HighlighterPosition;)V", "getChapter", "()Lio/elevenlabs/domain/model/Chapter;", "getElementIndex", "()I", "getPosition", "()Lio/elevenlabs/highlighter/HighlighterPosition;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ActiveElement implements HighlightFocus {
        public static final int $stable = 8;
        private final Chapter chapter;
        private final int elementIndex;
        private final HighlighterPosition position;

        public ActiveElement(Chapter chapter, int i10, HighlighterPosition highlighterPosition) {
            highlighterPosition.getClass();
            this.chapter = chapter;
            this.elementIndex = i10;
            this.position = highlighterPosition;
        }

        public static /* synthetic */ ActiveElement copy$default(ActiveElement activeElement, Chapter chapter, int i10, HighlighterPosition highlighterPosition, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                chapter = activeElement.chapter;
            }
            if ((i11 & 2) != 0) {
                i10 = activeElement.elementIndex;
            }
            if ((i11 & 4) != 0) {
                highlighterPosition = activeElement.position;
            }
            return activeElement.copy(chapter, i10, highlighterPosition);
        }

        /* renamed from: component1, reason: from getter */
        public final Chapter getChapter() {
            return this.chapter;
        }

        /* renamed from: component2, reason: from getter */
        public final int getElementIndex() {
            return this.elementIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final HighlighterPosition getPosition() {
            return this.position;
        }

        public final ActiveElement copy(Chapter chapter, int elementIndex, HighlighterPosition position) {
            position.getClass();
            return new ActiveElement(chapter, elementIndex, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveElement)) {
                return false;
            }
            ActiveElement activeElement = (ActiveElement) other;
            if (kotlin.jvm.internal.m.c(this.chapter, activeElement.chapter) && this.elementIndex == activeElement.elementIndex && kotlin.jvm.internal.m.c(this.position, activeElement.position)) {
                return true;
            }
            return false;
        }

        public final Chapter getChapter() {
            return this.chapter;
        }

        public final int getElementIndex() {
            return this.elementIndex;
        }

        public final HighlighterPosition getPosition() {
            return this.position;
        }

        public int hashCode() {
            int hashCode;
            Chapter chapter = this.chapter;
            if (chapter == null) {
                hashCode = 0;
            } else {
                hashCode = chapter.hashCode();
            }
            return this.position.hashCode() + j0.c.b(this.elementIndex, hashCode * 31, 31);
        }

        public String toString() {
            return "ActiveElement(chapter=" + this.chapter + ", elementIndex=" + this.elementIndex + ", position=" + this.position + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/highlighter/HighlightFocus$None;", "Lio/elevenlabs/highlighter/HighlightFocus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class None implements HighlightFocus {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof None)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 769559414;
        }

        public String toString() {
            return "None";
        }
    }
}
