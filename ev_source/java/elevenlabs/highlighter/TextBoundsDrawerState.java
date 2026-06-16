package io.elevenlabs.highlighter;

import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import g3.j0;
import io.elevenlabs.highlighter.HighlighterPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.t0;
import p3.v0;
import s4.u0;
import tn.c0;
import u2.f1;
import u2.r;
import u2.x0;
import u2.z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\fJ\u0011\u0010\u0016\u001a\u00020\n*\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR+\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R7\u0010,\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020%0$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R7\u00100\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020%0$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lio/elevenlabs/highlighter/TextBoundsDrawerState;", "", "Lio/elevenlabs/highlighter/AnnotationData;", "initialData", "Lio/elevenlabs/highlighter/Styling;", "styling", "<init>", "(Lio/elevenlabs/highlighter/AnnotationData;Lio/elevenlabs/highlighter/Styling;)V", "Ls4/u0;", "tl", "Lsn/z;", "recalculate", "(Ls4/u0;)V", "Lio/elevenlabs/highlighter/HighlighterPosition;", "position", "updatePosition", "(Lio/elevenlabs/highlighter/HighlighterPosition;)V", "newData", "updateData", "(Lio/elevenlabs/highlighter/AnnotationData;)V", "onTextLayout", "Lr3/e;", "draw", "(Lr3/e;)V", "Lio/elevenlabs/highlighter/Styling;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/highlighter/AnnotationData;", "", "<set-?>", "selectedPositionTop$delegate", "Lu2/x0;", "getSelectedPositionTop", "()I", "setSelectedPositionTop", "(I)V", "selectedPositionTop", "", "Lo3/c;", "highlightBounds$delegate", "Lu2/z0;", "getHighlightBounds", "()Ljava/util/List;", "setHighlightBounds", "(Ljava/util/List;)V", "highlightBounds", "activeWordBounds$delegate", "getActiveWordBounds", "setActiveWordBounds", "activeWordBounds", "Lp3/v0;", "activeParagraphBoundsPath", "Lp3/v0;", "Lp3/t0;", "activeParagraphPaint", "Lp3/t0;", "lastLayout", "Ls4/u0;", "currentPosition", "Lio/elevenlabs/highlighter/HighlighterPosition;", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TextBoundsDrawerState {
    private v0 activeParagraphBoundsPath;
    private final t0 activeParagraphPaint;

    /* renamed from: activeWordBounds$delegate, reason: from kotlin metadata */
    private final z0 activeWordBounds;
    private HighlighterPosition currentPosition;
    private AnnotationData data;

    /* renamed from: highlightBounds$delegate, reason: from kotlin metadata */
    private final z0 highlightBounds;
    private u0 lastLayout;

    /* renamed from: selectedPositionTop$delegate, reason: from kotlin metadata */
    private final x0 selectedPositionTop;
    private final Styling styling;

    public TextBoundsDrawerState(AnnotationData annotationData, Styling styling) {
        annotationData.getClass();
        styling.getClass();
        this.styling = styling;
        this.data = annotationData;
        this.selectedPositionTop = new f1(-1);
        tn.t tVar = tn.t.f33547a;
        this.highlightBounds = r.A(tVar);
        this.activeWordBounds = r.A(tVar);
        this.activeParagraphBoundsPath = p3.k.a();
        p3.g i10 = h0.i();
        i10.e(styling.getColorConfig().m968getActiveSentenceColor0d7_KjU());
        i10.l(0);
        i10.f26379a.setAntiAlias(true);
        this.activeParagraphPaint = i10;
    }

    private final List<o3.c> getActiveWordBounds() {
        return (List) this.activeWordBounds.getValue();
    }

    private final List<o3.c> getHighlightBounds() {
        return (List) this.highlightBounds.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void recalculate(u0 tl2) {
        u0 u0Var;
        o3.c expand;
        List sentenceBounds;
        v0 buildActiveParagraphPath;
        int selectedPositionTop;
        o3.c expand2;
        o3.c expand3;
        if (tl2.f31144a.f31132a.f31041b.length() != this.data.getText().f31041b.length()) {
            return;
        }
        HighlighterPosition highlighterPosition = this.currentPosition;
        WordAnnotation wordAnnotation = null;
        if (highlighterPosition != null) {
            if (highlighterPosition instanceof HighlighterPosition.Character) {
                Iterator<T> it = this.data.getAnnotations().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((WordAnnotation) next).getC() == ((HighlighterPosition.Character) highlighterPosition).getOffset()) {
                        wordAnnotation = next;
                        break;
                    }
                }
                wordAnnotation = wordAnnotation;
            } else if (highlighterPosition instanceof HighlighterPosition.Time) {
                List<WordAnnotation> annotations = this.data.getAnnotations();
                annotations.getClass();
                Iterator it2 = new c0(annotations).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((j0) it2).f10471b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    WordAnnotation wordAnnotation2 = (WordAnnotation) previous;
                    HighlighterPosition.Time time = (HighlighterPosition.Time) highlighterPosition;
                    if (kotlin.jvm.internal.m.c(wordAnnotation2.getAudioFileNumber(), time.getAudioFileNumber()) && wordAnnotation2.getTs() != null && wordAnnotation2.getTs().doubleValue() <= time.getSeconds()) {
                        wordAnnotation = previous;
                        break;
                    }
                }
                wordAnnotation = wordAnnotation;
            } else {
                c6.p();
                return;
            }
        }
        List<o3.c> list = tn.t.f33547a;
        if (wordAnnotation != null) {
            sentenceBounds = HighlighterKt.getSentenceBounds(tl2, 0, this.data.getText().f31041b.length());
            ArrayList arrayList = new ArrayList(tn.p.a0(sentenceBounds, 10));
            Iterator it3 = sentenceBounds.iterator();
            while (it3.hasNext()) {
                expand3 = HighlighterKt.expand((o3.c) it3.next(), this.styling.getHighlightHorizontalPadding(), this.styling.getHighlightVerticalPadding());
                arrayList.add(expand3);
            }
            buildActiveParagraphPath = HighlighterKt.buildActiveParagraphPath(arrayList, this.styling.getActiveParagraphBoundExtraGrowth(), this.styling.getActiveParagraphBoundExtraGrowth() + this.styling.getHighlightRadius());
            this.activeParagraphBoundsPath = buildActiveParagraphPath;
            List boundingBoxes$default = HighlighterKt.getBoundingBoxes$default(tl2, wordAnnotation.getStart(), wordAnnotation.getEnd(), false, 4, null);
            u0Var = tl2;
            ArrayList arrayList2 = new ArrayList(tn.p.a0(boundingBoxes$default, 10));
            Iterator it4 = boundingBoxes$default.iterator();
            while (it4.hasNext()) {
                expand2 = HighlighterKt.expand((o3.c) it4.next(), this.styling.getHighlightHorizontalPadding(), this.styling.getHighlightVerticalPadding());
                arrayList2.add(expand2);
            }
            setActiveWordBounds(arrayList2);
            o3.c cVar = (o3.c) tn.o.y0(getActiveWordBounds());
            if (cVar != null) {
                selectedPositionTop = (int) cVar.f24767b;
            } else {
                selectedPositionTop = getSelectedPositionTop();
            }
            setSelectedPositionTop(selectedPositionTop);
        } else {
            u0Var = tl2;
            ((p3.i) this.activeParagraphBoundsPath).h();
            setActiveWordBounds(list);
            setSelectedPositionTop(-1);
        }
        if (!this.data.getBookmarks().isEmpty()) {
            List<BookmarkAnnotation> bookmarks = this.data.getBookmarks();
            list = new ArrayList<>();
            for (BookmarkAnnotation bookmarkAnnotation : bookmarks) {
                List boundingBoxes$default2 = HighlighterKt.getBoundingBoxes$default(u0Var, bookmarkAnnotation.getStart(), bookmarkAnnotation.getEnd(), false, 4, null);
                ArrayList arrayList3 = new ArrayList(tn.p.a0(boundingBoxes$default2, 10));
                Iterator it5 = boundingBoxes$default2.iterator();
                while (it5.hasNext()) {
                    expand = HighlighterKt.expand((o3.c) it5.next(), this.styling.getHighlightHorizontalPadding(), this.styling.getHighlightVerticalPadding());
                    arrayList3.add(expand);
                }
                tn.o.g0(arrayList3, list);
            }
        }
        setHighlightBounds(list);
    }

    private final void setActiveWordBounds(List<o3.c> list) {
        this.activeWordBounds.setValue(list);
    }

    private final void setHighlightBounds(List<o3.c> list) {
        this.highlightBounds.setValue(list);
    }

    private final void setSelectedPositionTop(int i10) {
        ((f1) this.selectedPositionTop).i(i10);
    }

    public final void draw(r3.e eVar) {
        long m970getBookmarkBgColor0d7_KjU;
        eVar.getClass();
        if (!((p3.i) this.activeParagraphBoundsPath).f26399a.isEmpty()) {
            eVar.f0().y().l(this.activeParagraphBoundsPath, this.activeParagraphPaint);
        }
        for (o3.c cVar : getHighlightBounds()) {
            boolean isEmpty = ((p3.i) this.activeParagraphBoundsPath).f26399a.isEmpty();
            Styling styling = this.styling;
            if (!isEmpty) {
                m970getBookmarkBgColor0d7_KjU = styling.getColorConfig().m967getActiveSentenceBookmarkBgColor0d7_KjU();
            } else {
                m970getBookmarkBgColor0d7_KjU = styling.getColorConfig().m970getBookmarkBgColor0d7_KjU();
            }
            long j4 = m970getBookmarkBgColor0d7_KjU;
            long e10 = cVar.e();
            long d10 = cVar.d();
            float highlightRadius = this.styling.getHighlightRadius();
            eVar.c0(j4, e10, d10, (Float.floatToRawIntBits(highlightRadius) << 32) | (Float.floatToRawIntBits(highlightRadius) & 4294967295L));
        }
        for (o3.c cVar2 : getActiveWordBounds()) {
            long m969getActiveWordColor0d7_KjU = this.styling.getColorConfig().m969getActiveWordColor0d7_KjU();
            long e11 = cVar2.e();
            long d11 = cVar2.d();
            float highlightRadius2 = this.styling.getHighlightRadius();
            eVar.c0(m969getActiveWordColor0d7_KjU, e11, d11, (Float.floatToRawIntBits(highlightRadius2) << 32) | (Float.floatToRawIntBits(highlightRadius2) & 4294967295L));
        }
    }

    public final int getSelectedPositionTop() {
        return ((f1) this.selectedPositionTop).h();
    }

    public final void onTextLayout(u0 tl2) {
        tl2.getClass();
        this.lastLayout = tl2;
        recalculate(tl2);
    }

    public final void updateData(AnnotationData newData) {
        newData.getClass();
        if (!newData.equals(this.data)) {
            this.data = newData;
            u0 u0Var = this.lastLayout;
            if (u0Var != null) {
                recalculate(u0Var);
            }
        }
    }

    public final void updatePosition(HighlighterPosition position) {
        if (!kotlin.jvm.internal.m.c(this.currentPosition, position)) {
            this.currentPosition = position;
            u0 u0Var = this.lastLayout;
            if (u0Var != null) {
                recalculate(u0Var);
            }
        }
    }
}
