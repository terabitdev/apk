package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import sn.z;
import t1.i;
import t1.t;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt1/t;", "", "sectionKey", "Lkotlin/Function0;", "title", "Lsn/z;", "voicePickerExploreSectionTitle", "(Lt1/t;Ljava/lang/String;Lho/p;)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreSectionTitleKt {
    public static final void voicePickerExploreSectionTitle(t tVar, String str, p pVar) {
        tVar.getClass();
        str.getClass();
        pVar.getClass();
        ((i) tVar).t("voice_picker_view_type_section_title_".concat(str), VoicePickerContract.ViewType.SECTION_TITLE, new j(new b(pVar, 0), true, 870557147));
    }

    public static final z voicePickerExploreSectionTitle$lambda$0(p pVar, t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String str = (String) pVar.invoke(qVar, 0);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(str, r1.d.E(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM()), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700(), qVar, 0, 0, 131068);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }
}
