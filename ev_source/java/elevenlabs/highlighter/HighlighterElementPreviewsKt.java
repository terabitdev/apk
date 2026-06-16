package io.elevenlabs.highlighter;

import f4.f1;
import i4.j1;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterSlot;
import io.elevenlabs.domain.model.HighlighterPositionConverter;
import io.elevenlabs.domain.model.PlayerActionButton;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.highlighter.HighlighterPosition;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsSpacings;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsTypography;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t1.b0;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u000f\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\u0005\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\u0005\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/highlighter/Styling;", "previewStyling", "(Lu2/m;I)Lio/elevenlabs/highlighter/Styling;", "Lsn/z;", "Preview_InfoElement", "(Lu2/m;I)V", "Preview_SpeakerNameElement", "Preview_FeedbackSectionElement", "Preview_TextElement", "Preview_TextElement_WithBookmarks", "", "html", "", "Lio/elevenlabs/highlighter/BookmarkHighlight;", "bookmarks", "Lio/elevenlabs/highlighter/HighlighterData;", "previewElementState", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/highlighter/HighlighterData;", "highlighter_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlighterElementPreviewsKt {
    public static final void Preview_FeedbackSectionElement(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-476116553);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            org.jsoup.nodes.k parseSingleElement = HighlighterKt.parseSingleElement("<div class=\"feedback-section\">\n        <h3>How was this conversation?</h3>\n        <div class=\"feedback-button-share\">Share Feedback</div>\n        <img class=\"feedback-host-orb\" src=\"https://example.com/host.jpg\" alt=\"Host\" />\n        <img class=\"feedback-guest-orb\" src=\"https://example.com/guest.jpg\" alt=\"Guest\" />\n    </div>");
            parseSingleElement.getClass();
            i3.t E = r1.d.E(r1.d.y(i3.q.f13017a), 16);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ColorScheme color = ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.data.model.response.d(27);
                qVar.h0(L);
            }
            HighlighterKt.FeedbackSectionElement(parseSingleElement, color, (ho.a) L, qVar, (ColorScheme.$stable << 3) | 384);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 14);
        }
    }

    public static final sn.z Preview_FeedbackSectionElement$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_FeedbackSectionElement(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_InfoElement(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1850728017);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            org.jsoup.nodes.k parseSingleElement = HighlighterKt.parseSingleElement("<div class=\"info-box\">This is an important information box that provides additional context to the reader.</div>");
            parseSingleElement.getClass();
            i3.t E = r1.d.E(r1.d.y(i3.q.f13017a), 16);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            HighlighterKt.InfoElement(parseSingleElement, qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 13);
        }
    }

    public static final sn.z Preview_InfoElement$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_InfoElement(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SpeakerNameElement(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1430392511);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            org.jsoup.nodes.k parseSingleElement = HighlighterKt.parseSingleElement("<div class=\"voice-row\">\n        <img src=\"https://example.com/avatar.jpg\" alt=\"Voice avatar\" />\n        <span class=\"voice-name\">Sarah Johnson</span>\n    </div>");
            parseSingleElement.getClass();
            i3.t E = r1.d.E(r1.d.y(i3.q.f13017a), 16);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            HighlighterKt.SpeakerNameElement(parseSingleElement, qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 12);
        }
    }

    public static final sn.z Preview_SpeakerNameElement$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SpeakerNameElement(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_TextElement(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1844789230);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            org.jsoup.nodes.k parseSingleElement = HighlighterKt.parseSingleElement("<p>\n        <span c=\"0\">The</span>\n        <span c=\"4\">robot</span>\n        <span c=\"10\">found</span>\n        <span c=\"16\">an</span>\n        <span c=\"19\">old</span>\n        <span c=\"23\">record</span>\n        <span c=\"30\">player</span>\n        <span c=\"37\">in</span>\n        <span c=\"40\">the</span>\n        <span c=\"44\">attic</span>\n        <span c=\"50\">and</span>\n        <span c=\"54\">played</span>\n        <span c=\"61\">it,</span>\n        <span c=\"65\">curious</span>\n        <span c=\"73\">about</span>\n        <span c=\"79\">human</span>\n        <span c=\"85\">nostalgia.</span>\n    </p>");
            parseSingleElement.getClass();
            Styling previewStyling = previewStyling(qVar, 0);
            HighlighterData previewElementState$default = previewElementState$default("<p>\n        <span c=\"0\">The</span>\n        <span c=\"4\">robot</span>\n        <span c=\"10\">found</span>\n        <span c=\"16\">an</span>\n        <span c=\"19\">old</span>\n        <span c=\"23\">record</span>\n        <span c=\"30\">player</span>\n        <span c=\"37\">in</span>\n        <span c=\"40\">the</span>\n        <span c=\"44\">attic</span>\n        <span c=\"50\">and</span>\n        <span c=\"54\">played</span>\n        <span c=\"61\">it,</span>\n        <span c=\"65\">curious</span>\n        <span c=\"73\">about</span>\n        <span c=\"79\">human</span>\n        <span c=\"85\">nostalgia.</span>\n    </p>", null, 2, null);
            i3.t E = r1.d.E(r1.d.y(i3.q.f13017a), 16);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            HighlighterPosition.Character character = new HighlighterPosition.Character(50L);
            List<ChapterSlot> slots = previewElementState$default.getSlots();
            ArrayList arrayList = new ArrayList(tn.p.a0(slots, 10));
            Iterator<T> it = slots.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChapterSlot) it.next()).getChapter());
            }
            t1.z a10 = b0.a(0, qVar, 3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new fm.d(21);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new fm.d(23);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new fm.d(24);
                qVar.h0(L3);
            }
            HighlighterKt.TextElement(0, previewStyling, parseSingleElement, character, 0, previewElementState$default, arrayList, a10, false, lVar, lVar2, (ho.l) L3, null, null, qVar, 905994246, 54, 12288);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 11);
        }
    }

    public static final sn.z Preview_TextElement$lambda$0$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z Preview_TextElement$lambda$0$2$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_TextElement$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_TextElement$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_TextElement(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_TextElement_WithBookmarks(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-614704970);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            org.jsoup.nodes.k parseSingleElement = HighlighterKt.parseSingleElement("<p>\n        <span c=\"0\">The</span>\n        <span c=\"4\">robot</span>\n        <span c=\"10\">found</span>\n        <span c=\"16\">an</span>\n        <span c=\"19\">old</span>\n        <span c=\"23\">record</span>\n        <span c=\"30\">player</span>\n        <span c=\"37\">in</span>\n        <span c=\"40\">the</span>\n        <span c=\"44\">attic</span>\n        <span c=\"50\">and</span>\n        <span c=\"54\">played</span>\n        <span c=\"61\">it,</span>\n        <span c=\"65\">curious</span>\n        <span c=\"73\">about</span>\n        <span c=\"79\">human</span>\n        <span c=\"85\">nostalgia.</span>\n    </p>");
            parseSingleElement.getClass();
            Styling previewStyling = previewStyling(qVar, 0);
            HighlighterData previewElementState = previewElementState("<p>\n        <span c=\"0\">The</span>\n        <span c=\"4\">robot</span>\n        <span c=\"10\">found</span>\n        <span c=\"16\">an</span>\n        <span c=\"19\">old</span>\n        <span c=\"23\">record</span>\n        <span c=\"30\">player</span>\n        <span c=\"37\">in</span>\n        <span c=\"40\">the</span>\n        <span c=\"44\">attic</span>\n        <span c=\"50\">and</span>\n        <span c=\"54\">played</span>\n        <span c=\"61\">it,</span>\n        <span c=\"65\">curious</span>\n        <span c=\"73\">about</span>\n        <span c=\"79\">human</span>\n        <span c=\"85\">nostalgia.</span>\n    </p>", ig.f.I(new BookmarkHighlight("1", 10L, 30L), new BookmarkHighlight("2", 50L, 70L)));
            i3.t E = r1.d.E(r1.d.y(i3.q.f13017a), 16);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            HighlighterPosition.Character character = new HighlighterPosition.Character(23L);
            List<ChapterSlot> slots = previewElementState.getSlots();
            ArrayList arrayList = new ArrayList(tn.p.a0(slots, 10));
            Iterator<T> it = slots.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChapterSlot) it.next()).getChapter());
            }
            t1.z a10 = b0.a(0, qVar, 3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new fm.d(25);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new fm.d(26);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new fm.d(22);
                qVar.h0(L3);
            }
            HighlighterKt.TextElement(0, previewStyling, parseSingleElement, character, 0, previewElementState, arrayList, a10, false, lVar, lVar2, (ho.l) L3, null, null, qVar, 905994246, 54, 12288);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 10);
        }
    }

    public static final sn.z Preview_TextElement_WithBookmarks$lambda$0$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z Preview_TextElement_WithBookmarks$lambda$0$2$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_TextElement_WithBookmarks$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_TextElement_WithBookmarks$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_TextElement_WithBookmarks(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final HighlighterData previewElementState(String str, List<BookmarkHighlight> list) {
        List H = ig.f.H(str);
        Map<Long, Integer> offsetsToElementsIndexMap = HighlighterPreviewsKt.toOffsetsToElementsIndexMap(H);
        return new HighlighterData(ig.f.H(new ChapterSlot(new Chapter(0, 0L, "Preview", 0L, false, 0L, null, null, 192, null), 0, H.size(), tn.o.g1(offsetsToElementsIndexMap.keySet()), 0, new ChapterContent(0, H, offsetsToElementsIndexMap, HighlighterPositionConverter.INSTANCE.getEMPTY()))), false, list, null, 10, null);
    }

    public static /* synthetic */ HighlighterData previewElementState$default(String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = tn.t.f33547a;
        }
        return previewElementState(str, list);
    }

    private static final Styling previewStyling(u2.m mVar, int i10) {
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        ElevenLabsTypography typo = elevenLabsTheme.getTypo(mVar, i11);
        ElevenLabsSpacings spacings = elevenLabsTheme.getSpacings(mVar, i11);
        ColorScheme color = elevenLabsTheme.getColor(mVar, i11);
        return new Styling(new UserConfig.PlayerConfig(14L, PlayerFontFamily.LIBRE, PlayerTheme.SKY, PlayerActionButton.SLEEP_TIMER, PlayerDisplayMode.Text), (h5.c) ((u2.q) mVar).j(j1.f13129h), typo, color, spacings);
    }
}
