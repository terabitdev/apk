package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import c3.j;
import defpackage.f;
import ho.l;
import ho.p;
import ho.r;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import t1.i;
import t1.t;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lt1/t;", "", "sectionKey", "Lkotlin/Function0;", "title", "", "Lio/elevenlabs/domain/model/Voice;", "voices", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "Lsn/z;", "onSharedEvent", "voicePickerExploreListSection", "(Lt1/t;Ljava/lang/String;Lho/p;Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreListSectionKt {
    public static final void voicePickerExploreListSection(t tVar, String str, p pVar, final List<Voice> list, final VoicePickerSharedContract.State state, final l lVar) {
        tVar.getClass();
        str.getClass();
        pVar.getClass();
        list.getClass();
        state.getClass();
        lVar.getClass();
        if (!list.isEmpty()) {
            VoicePickerExploreSectionTitleKt.voicePickerExploreSectionTitle(tVar, str, pVar);
            final id.b bVar = new id.b(str, 5, (byte) 0);
            ((i) tVar).u(list.size(), new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreListSectionKt$voicePickerExploreListSection$$inlined$itemsIndexed$1
                public final Object invoke(int i10) {
                    return p.this.invoke(Integer.valueOf(i10), list.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreListSectionKt$voicePickerExploreListSection$$inlined$itemsIndexed$2
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i10) {
                    return VoicePickerContract.ViewType.VOICE_ROW;
                }
            }, new j(new r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreListSectionKt$voicePickerExploreListSection$$inlined$itemsIndexed$3
                public final void invoke(t1.b bVar2, int i10, m mVar, int i11) {
                    int i12;
                    boolean z6;
                    int i13;
                    int i14;
                    if ((i11 & 6) == 0) {
                        if (((q) mVar).f(bVar2)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i12 = i14 | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        if (((q) mVar).d(i10)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i12 |= i13;
                    }
                    if ((i12 & 147) != 146) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    q qVar = (q) mVar;
                    if (qVar.O(i12 & 1, z6)) {
                        Voice voice = (Voice) list.get(i10);
                        qVar.X(-1940419284);
                        VoicePickerVoiceRowKt.VoicePickerVoiceRow(voice, state, lVar, false, false, qVar, 0, 24);
                        qVar.p(false);
                        return;
                    }
                    qVar.R();
                }

                @Override // ho.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                    return z.f31622a;
                }
            }, true, 2039820996));
        }
    }

    public static final Object voicePickerExploreListSection$lambda$0(String str, int i10, Voice voice) {
        voice.getClass();
        return f.j(str, "_voice_picker_view_type_voice_row_", voice.getVoiceId());
    }
}
