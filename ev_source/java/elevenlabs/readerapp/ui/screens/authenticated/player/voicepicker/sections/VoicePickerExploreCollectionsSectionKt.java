package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import a2.i;
import a2.t0;
import android.graphics.Color;
import c3.j;
import ho.l;
import i3.k;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.readerapp.ui.components.VoiceCollectionCellKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.g;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import sn.z;
import t1.t;
import u2.e;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import w1.h0;
import w1.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt1/t;", "", "sectionKey", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceCollections;", "section", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/VoiceCollection;", "Lsn/z;", "navigateToVoiceCollection", "voicePickerExploreCollectionsSection", "(Lt1/t;Ljava/lang/String;Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceCollections;Lho/l;)V", "HorizontalCollectionsList", "(Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceCollections;Lho/l;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreCollectionsSectionKt {
    private static final void HorizontalCollectionsList(ExploreVoiceSections.Section.VoiceCollections voiceCollections, l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        q qVar2 = (q) mVar;
        qVar2.Z(-353076672);
        if ((i10 & 6) == 0) {
            if (qVar2.h(voiceCollections)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar2, 6);
            boolean c5 = qVar2.c(m1979rememberDpToPx8Feqmps);
            Object L = qVar2.L();
            e eVar = u2.l.f33918a;
            if (c5 || L == eVar) {
                L = new PageSizeWithRatio(0.8f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                qVar2.h0(L);
            }
            PageSizeWithRatio pageSizeWithRatio = (PageSizeWithRatio) L;
            boolean h10 = qVar2.h(voiceCollections);
            Object L2 = qVar2.L();
            if (h10 || L2 == eVar) {
                L2 = new g(voiceCollections, 1);
                qVar2.h0(L2);
            }
            w1.c b10 = h0.b(0, (ho.a) L2, qVar2, 0, 3);
            k kVar = i3.d.f13004y0;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            float m2357getX5D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, i14).m2357getX5D9Ej5fM();
            float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, i14).m2353getX2D9Ej5fM();
            qVar = qVar2;
            gg.b.d(b10, null, new d2(m2357getX5D9Ej5fM, m2353getX2D9Ej5fM, m2357getX5D9Ej5fM, m2353getX2D9Ej5fM), pageSizeWithRatio, 0, 10, kVar, null, false, null, null, null, c3.k.d(-1361941375, true, new io.elevenlabs.readerapp.e(voiceCollections, lVar, 5), qVar2), qVar, 1769472, 24576, 16274);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i(voiceCollections, lVar, i10, 18);
        }
    }

    public static final int HorizontalCollectionsList$lambda$1$0(ExploreVoiceSections.Section.VoiceCollections voiceCollections) {
        return voiceCollections.getCollections().size();
    }

    public static final z HorizontalCollectionsList$lambda$2(ExploreVoiceSections.Section.VoiceCollections voiceCollections, l lVar, w wVar, int i10, m mVar, int i11) {
        wVar.getClass();
        VoiceCollection voiceCollection = voiceCollections.getCollections().get(i10);
        String title = voiceCollection.getTitle();
        String coverImageUrl = voiceCollection.getCoverImageUrl();
        long c5 = p3.h0.c(Color.parseColor(voiceCollection.getBackgroundColor()));
        q qVar = (q) mVar;
        boolean f10 = qVar.f(lVar) | qVar.h(voiceCollection);
        Object L = qVar.L();
        if (f10 || L == u2.l.f33918a) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c(lVar, voiceCollection);
            qVar.h0(L);
        }
        VoiceCollectionCellKt.m1095VoiceCollectionCellFNF3uiM(title, coverImageUrl, c5, (ho.a) L, qVar, 0);
        return z.f31622a;
    }

    public static final z HorizontalCollectionsList$lambda$2$0$0(l lVar, VoiceCollection voiceCollection) {
        lVar.invoke(voiceCollection);
        return z.f31622a;
    }

    public static final z HorizontalCollectionsList$lambda$3(ExploreVoiceSections.Section.VoiceCollections voiceCollections, l lVar, int i10, m mVar, int i11) {
        HorizontalCollectionsList(voiceCollections, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void voicePickerExploreCollectionsSection(t tVar, String str, ExploreVoiceSections.Section.VoiceCollections voiceCollections, l lVar) {
        tVar.getClass();
        str.getClass();
        voiceCollections.getClass();
        lVar.getClass();
        VoicePickerExploreSectionTitleKt.voicePickerExploreSectionTitle(tVar, str, new t0(voiceCollections, 12));
        ((t1.i) tVar).t(str.concat("_voice_picker_view_type_collections_horizontal_list"), VoicePickerContract.ViewType.COLLECTIONS_HORIZONTAL_LIST, new j(new defpackage.b(voiceCollections, lVar, 11), true, -852541224));
    }

    public static final String voicePickerExploreCollectionsSection$lambda$0(ExploreVoiceSections.Section.VoiceCollections voiceCollections, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.X(1328603928);
        String title = voiceCollections.getTitle();
        qVar.p(false);
        return title;
    }

    public static final z voicePickerExploreCollectionsSection$lambda$1(ExploreVoiceSections.Section.VoiceCollections voiceCollections, l lVar, t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HorizontalCollectionsList(voiceCollections, lVar, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }
}
