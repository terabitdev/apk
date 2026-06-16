package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import f4.f1;
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
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import ir.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.WebrtcBuildVersion;
import p3.h0;
import tn.c0;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u000f\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u000f\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u000f\u0010\u0018\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0012\u001a\u000f\u0010\u0019\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u000f\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u0012\u001a\u000f\u0010\u001b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0012\u001a\u000f\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u0012\u001a\u000f\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0012\u001a\u000f\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u0012\u001a\u000f\u0010\u001f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010\u0012\u001a\u000f\u0010 \u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010\u0012\u001a\u000f\u0010!\u001a\u00020\u0010H\u0007¢\u0006\u0004\b!\u0010\u0012\u001a\u000f\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\"\u0010\u0012\u001a\u000f\u0010#\u001a\u00020\u0010H\u0007¢\u0006\u0004\b#\u0010\u0012\u001a\u000f\u0010$\u001a\u00020\u0010H\u0007¢\u0006\u0004\b$\u0010\u0012\u001a\u000f\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010\u0012\u001a\u000f\u0010&\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010\u0012\u001a%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'*\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "fileName", "", "useAssetFileContent", "(Ljava/lang/String;Lu2/m;I)Ljava/util/List;", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "defaultPlayerConfig", "(Lu2/m;I)Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "elements", "", "followingContent", "Lio/elevenlabs/highlighter/BookmarkHighlight;", "bookmarks", "Lio/elevenlabs/highlighter/HighlighterData;", "previewState", "(Ljava/util/List;ZLjava/util/List;)Lio/elevenlabs/highlighter/HighlighterData;", "Lsn/z;", "Preview_Highlighter_SimpleHtml", "(Lu2/m;I)V", "Preview_Highlighter_MultipleParagraphs", "Preview_Highlighter_Styling", "Preview_Highlighter_Lists", "Preview_Highlighter_Lists_Ordered_Nested", "Preview_Highlighter_Lists_Unordered_Nested", "Preview_Highlighter_Highlight", "Preview_Highlighter_Highlight_Images", "Preview_Highlighter_FollowingContent", "Preview_Highlighter_Highlights", "Preview_Highlighter_Highlights_Heavy", "Preview_Highlighter_FollowingContent_ThemeSky", "Preview_Highlighter_FollowingContent_ThemeFall", "Preview_Highlighter_FollowingContent_ThemeHighlight", "Preview_Highlighter_FollowingContent_ThemeClassic", "Preview_Highlighter_USA", "Preview_Highlighter_Nested", "Preview_Highlighter_EmptyParagraphs", "Preview_Highlighter_Podcast", "Preview_Highlighter_Divider", "Preview_Highlighter_InfoBox", "", "", "", "toOffsetsToElementsIndexMap", "(Ljava/util/List;)Ljava/util/Map;", "highlighter_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlighterPreviewsKt {
    public static final void Preview_Highlighter_Divider(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-78310566);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("divider.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(11);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(24);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(25);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(26);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$1595825264$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 24);
        }
    }

    public static final sn.z Preview_Highlighter_Divider$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Divider$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Divider$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Divider$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Divider(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_EmptyParagraphs(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-350079693);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("empty-paragraphs.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(22);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(28);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(29);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new z(1);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m971getLambda$1217132471$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 5);
        }
    }

    public static final sn.z Preview_Highlighter_EmptyParagraphs$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_EmptyParagraphs$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_EmptyParagraphs$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_EmptyParagraphs$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_EmptyParagraphs(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_FollowingContent(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1703599473);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(1618L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(5);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(8);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(9);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(10);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$1482535481$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 19);
        }
    }

    public static final sn.z Preview_Highlighter_FollowingContent$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_FollowingContent(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_FollowingContent_ThemeClassic(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2130599265);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig copy$default = UserConfig.PlayerConfig.copy$default(defaultPlayerConfig(qVar, 0), 0L, null, PlayerTheme.CLASSIC, null, null, 27, null);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(1618L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(16);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(11);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(12);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(13);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, copy$default, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$2063471095$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 0);
        }
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeClassic$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeClassic$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeClassic$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeClassic$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_FollowingContent_ThemeClassic(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_FollowingContent_ThemeFall(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-605566956);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig copy$default = UserConfig.PlayerConfig.copy$default(defaultPlayerConfig(qVar, 0), 0L, null, PlayerTheme.FALL, null, null, 27, null);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(1618L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(15);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(8);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(9);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(10);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, copy$default, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m972getLambda$142062786$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 29);
        }
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeFall$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeFall$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeFall$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeFall$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_FollowingContent_ThemeFall(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_FollowingContent_ThemeHighlight(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-819672381);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig copy$default = UserConfig.PlayerConfig.copy$default(defaultPlayerConfig(qVar, 0), 0L, null, PlayerTheme.HIGHLIGHT, null, null, 27, null);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(1618L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(6);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(11);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(12);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(13);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, copy$default, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m978getLambda$905334311$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 20);
        }
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeHighlight$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeHighlight$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeHighlight$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeHighlight$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_FollowingContent_ThemeHighlight(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_FollowingContent_ThemeSky(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1674225520);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig copy$default = UserConfig.PlayerConfig.copy$default(defaultPlayerConfig(qVar, 0), 0L, null, PlayerTheme.SKY, null, null, 27, null);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(1618L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(8);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(14);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(15);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(16);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, copy$default, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$165156614$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 21);
        }
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeSky$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeSky$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeSky$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_FollowingContent_ThemeSky$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_FollowingContent_ThemeSky(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Highlight(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1680782923);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(243L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(4);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(5);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(6);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(7);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$845981003$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 17);
        }
    }

    public static final sn.z Preview_Highlighter_Highlight$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlight$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlight$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlight$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Highlight(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Highlight_Images(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1477554794);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-images.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(243L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(17);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(14);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(15);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(16);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$368722452$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 1);
        }
    }

    public static final sn.z Preview_Highlighter_Highlight_Images$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlight_Images$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlight_Images$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlight_Images$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Highlight_Images(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Highlights(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1333770650);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-short.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, ig.f.I(new BookmarkHighlight(WebrtcBuildVersion.maint_version, 11L, 20L), new BookmarkHighlight("1", 111L, 221L), new BookmarkHighlight("2", 420L, 461L)), 2, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(16L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(7);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(20);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(27);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(4);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m976getLambda$313500272$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 28);
        }
    }

    public static final sn.z Preview_Highlighter_Highlights$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlights$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlights$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlights$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Highlights(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Highlights_Heavy(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1154361486);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("book-long.html", qVar, 6);
            ArrayList m12 = tn.o.m1(toOffsetsToElementsIndexMap(useAssetFileContent).keySet(), 10, 20, false);
            ArrayList arrayList = new ArrayList(tn.p.a0(m12, 10));
            Iterator it = m12.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                arrayList.add(new BookmarkHighlight(list.toString(), ((Number) tn.o.w0(list)).longValue(), ((Number) tn.o.G0(list)).longValue()));
            }
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, arrayList, 2, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(16L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(14);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(5);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(6);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(7);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$45529144$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 27);
        }
    }

    public static final sn.z Preview_Highlighter_Highlights_Heavy$lambda$1$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlights_Heavy$lambda$1$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlights_Heavy$lambda$1$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Highlights_Heavy$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Highlights_Heavy(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_InfoBox(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-441312642);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent("info-box.html", qVar, 6), false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(30L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(18);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(23);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(0);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new z(7);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$1232823188$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 18);
        }
    }

    public static final sn.z Preview_Highlighter_InfoBox$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_InfoBox$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_InfoBox$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_InfoBox$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_InfoBox(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Lists(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-269533418);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("lists.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(19);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(17);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(18);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(19);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m973getLambda$1501309524$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 2);
        }
    }

    public static final sn.z Preview_Highlighter_Lists$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Lists(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Lists_Ordered_Nested(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(871629722);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("lists_ordered_nested.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(24);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(5);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(6);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(4);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m974getLambda$1504137660$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 16);
        }
    }

    public static final sn.z Preview_Highlighter_Lists_Ordered_Nested$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists_Ordered_Nested$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists_Ordered_Nested$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists_Ordered_Nested$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Lists_Ordered_Nested(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Lists_Unordered_Nested(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1884492595);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("lists_unordered_nested.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(9);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(17);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(18);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(19);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m977getLambda$600327331$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 22);
        }
    }

    public static final sn.z Preview_Highlighter_Lists_Unordered_Nested$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists_Unordered_Nested$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists_Unordered_Nested$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Lists_Unordered_Nested$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Lists_Unordered_Nested(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_MultipleParagraphs(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1858925540);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("paragraphs.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(13);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(1);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(2);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(3);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$2000050502$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 26);
        }
    }

    public static final sn.z Preview_Highlighter_MultipleParagraphs$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_MultipleParagraphs$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_MultipleParagraphs$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_MultipleParagraphs$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_MultipleParagraphs(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Nested(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(801769118);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("nested.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(20);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(20);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(21);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(22);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$1271415496$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 3);
        }
    }

    public static final sn.z Preview_Highlighter_Nested$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Nested$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Nested$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Nested$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Nested(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Podcast(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(724020037);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("podcast.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(new HighlighterPosition.Character(30L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(10);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(21);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(22);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(23);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m975getLambda$1896811429$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 23);
        }
    }

    public static final sn.z Preview_Highlighter_Podcast$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Podcast$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Podcast$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Podcast$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Podcast(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_SimpleHtml(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1989554012);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("simple.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(12);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(28);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(29);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(0);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.m979getLambda$969283634$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 25);
        }
    }

    public static final sn.z Preview_Highlighter_SimpleHtml$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_SimpleHtml$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_SimpleHtml$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_SimpleHtml$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_SimpleHtml(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_Styling(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(352348783);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("styling.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 4, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(23);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(2);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(3);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new z(4);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$2026484613$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 6);
        }
    }

    public static final sn.z Preview_Highlighter_Styling$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Styling$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Styling$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_Styling$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_Styling(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Highlighter_USA(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(283228228);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<String> useAssetFileContent = useAssetFileContent("usa.html", qVar, 6);
            i3.t h10 = l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            HighlighterData previewState$default = previewState$default(useAssetFileContent, false, null, 6, null);
            UserConfig.PlayerConfig defaultPlayerConfig = defaultPlayerConfig(qVar, 0);
            b2 c10 = ir.r.c(null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(21);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new x(24);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new x(25);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new x(26);
                qVar.h0(L4);
            }
            HighlighterKt.Highlighter(previewState$default, defaultPlayerConfig, c10, aVar, lVar, lVar2, (ho.l) L4, ComposableSingletons$HighlighterPreviewsKt.INSTANCE.getLambda$666303578$highlighter_release(), null, null, null, false, null, null, null, null, null, qVar, 14380032, 0, 130816);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 4);
        }
    }

    public static final sn.z Preview_Highlighter_USA$lambda$0$1$0(WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_USA$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_USA$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Highlighter_USA$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Highlighter_USA(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final UserConfig.PlayerConfig defaultPlayerConfig(u2.m mVar, int i10) {
        return new UserConfig.PlayerConfig(14L, PlayerFontFamily.LIBRE, PlayerTheme.SKY, PlayerActionButton.SLEEP_TIMER, PlayerDisplayMode.Text);
    }

    private static final HighlighterData previewState(List<String> list, boolean z6, List<BookmarkHighlight> list2) {
        Map<Long, Integer> offsetsToElementsIndexMap = toOffsetsToElementsIndexMap(list);
        return new HighlighterData(ig.f.H(new ChapterSlot(new Chapter(0, 0L, "Preview", 0L, false, 0L, null, null, 192, null), 0, list.size(), tn.o.g1(offsetsToElementsIndexMap.keySet()), 0, new ChapterContent(0, list, offsetsToElementsIndexMap, HighlighterPositionConverter.INSTANCE.getEMPTY()))), z6, list2, null, 8, null);
    }

    public static /* synthetic */ HighlighterData previewState$default(List list, boolean z6, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = true;
        }
        if ((i10 & 4) != 0) {
            list2 = tn.t.f33547a;
        }
        return previewState(list, z6, list2);
    }

    public static final Map<Long, Integer> toOffsetsToElementsIndexMap(List<String> list) {
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wq.l lVar = new wq.l("<span c=\"(\\d+)\">");
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                Iterator it = vq.k.u0(vq.k.s0(wq.l.b(lVar, (String) obj), new x(27))).iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(Long.valueOf(((Number) it.next()).longValue()), Integer.valueOf(i10));
                }
                i10 = i11;
            } else {
                ig.f.U();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public static final Long toOffsetsToElementsIndexMap$lambda$0$0(wq.h hVar) {
        hVar.getClass();
        return wq.u.Z((String) ((c0) ((wq.i) hVar).a()).get(1));
    }

    private static final List<String> useAssetFileContent(String str, u2.m mVar, int i10) {
        String contentFor = HighlighterPreviewHtml.INSTANCE.contentFor(str);
        if (contentFor == null) {
            contentFor = wq.o.J("<p>Preview content missing for " + str + "</p>");
        }
        return wq.n.z0(contentFor, new String[]{Separators.RETURN}, 6);
    }
}
