package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import a2.t0;
import c3.j;
import com.google.protobuf.c6;
import defpackage.f;
import fm.o;
import ho.l;
import ho.p;
import ho.r;
import i3.k;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.domain.model.VoiceKt;
import io.elevenlabs.readerapp.core.h;
import io.elevenlabs.readerapp.ui.components.VoiceFavoriteButtonState;
import io.elevenlabs.readerapp.ui.components.VoiceFeaturedCellKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.g;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import sn.z;
import t1.i;
import t1.t;
import u2.e;
import u2.m;
import u2.q;
import w1.h0;
import w1.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt1/t;", "", "sectionKey", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$FeaturedVoices;", "section", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "Lsn/z;", "onSharedEvent", "voicePickerExploreFeaturedSection", "(Lt1/t;Ljava/lang/String;Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$FeaturedVoices;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreFeaturedSectionKt {
    public static final void voicePickerExploreFeaturedSection(t tVar, String str, ExploreVoiceSections.Section.FeaturedVoices featuredVoices, final VoicePickerSharedContract.State state, final l lVar) {
        tVar.getClass();
        str.getClass();
        featuredVoices.getClass();
        state.getClass();
        lVar.getClass();
        VoicePickerExploreSectionTitleKt.voicePickerExploreSectionTitle(tVar, str, new t0(featuredVoices, 13));
        i iVar = (i) tVar;
        iVar.t(str.concat("_voice_picker_view_type_featured_voices_horizontal_list"), VoicePickerContract.ViewType.FEATURED_VOICES_HORIZONTAL_LIST, new j(new o(featuredVoices, state, lVar, 19), true, 686259887));
        final List<Voice> voices = featuredVoices.getVoices();
        final id.b bVar = new id.b(str, 4, (byte) 0);
        iVar.u(voices.size(), new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreFeaturedSectionKt$voicePickerExploreFeaturedSection$$inlined$itemsIndexed$1
            public final Object invoke(int i10) {
                return p.this.invoke(Integer.valueOf(i10), voices.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreFeaturedSectionKt$voicePickerExploreFeaturedSection$$inlined$itemsIndexed$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                return VoicePickerContract.ViewType.VOICE_ROW;
            }
        }, new j(new r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreFeaturedSectionKt$voicePickerExploreFeaturedSection$$inlined$itemsIndexed$3
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
                    Voice voice = (Voice) voices.get(i10);
                    qVar.X(-2018771161);
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

    public static final String voicePickerExploreFeaturedSection$lambda$0(ExploreVoiceSections.Section.FeaturedVoices featuredVoices, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.X(929870063);
        String title = featuredVoices.getTitle();
        qVar.p(false);
        return title;
    }

    public static final z voicePickerExploreFeaturedSection$lambda$1(ExploreVoiceSections.Section.FeaturedVoices featuredVoices, VoicePickerSharedContract.State state, l lVar, t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(featuredVoices);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new g(featuredVoices, 2);
                qVar.h0(L);
            }
            w1.c b10 = h0.b(0, (ho.a) L, qVar, 0, 3);
            w1.i iVar = new w1.i(160);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM();
            k kVar = i3.d.f13004y0;
            float m2357getX5D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM();
            float m2355getX3D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM();
            gg.b.d(b10, null, new d2(m2357getX5D9Ej5fM, m2355getX3D9Ej5fM, m2357getX5D9Ej5fM, m2355getX3D9Ej5fM), iVar, 0, m2353getX2D9Ej5fM, kVar, null, false, null, null, null, c3.k.d(-1043383632, true, new h(featuredVoices, state, lVar, 11), qVar), qVar, 1572864, 24576, 16274);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final int voicePickerExploreFeaturedSection$lambda$1$0$0(ExploreVoiceSections.Section.FeaturedVoices featuredVoices) {
        return featuredVoices.getFeaturedVoices().size();
    }

    public static final z voicePickerExploreFeaturedSection$lambda$1$1(ExploreVoiceSections.Section.FeaturedVoices featuredVoices, VoicePickerSharedContract.State state, l lVar, w wVar, int i10, m mVar, int i11) {
        boolean z6;
        boolean z10;
        VoiceFavoriteButtonState nonFavorite;
        wVar.getClass();
        Voice voice = featuredVoices.getFeaturedVoices().get(i10);
        String voiceId = voice.getVoiceId();
        String name = voice.getName();
        String subtitle = voice.getSubtitle();
        if (subtitle == null) {
            subtitle = voice.getDescription();
        }
        String imageUrl = voice.getImageUrl();
        if (voice.getCategory() == VoiceCategory.Famous) {
            z6 = true;
        } else {
            z6 = false;
        }
        VoicePickerMode mode = state.getMode();
        if (mode instanceof VoicePickerMode.VoicePicker) {
            z10 = kotlin.jvm.internal.m.c(voice.getVoiceId(), state.getSelectedVoiceId());
        } else {
            if (!(mode instanceof VoicePickerMode.VoicesTab) && mode != null) {
                c6.p();
                return null;
            }
            z10 = false;
        }
        String useCase = voice.getUseCase();
        boolean c5 = kotlin.jvm.internal.m.c(state.getPlayingPreviewVoiceId(), voice.getVoiceId());
        if (state.getFavoriteChangeInProgressVoiceIds().contains(voice.getVoiceId())) {
            q qVar = (q) mVar;
            qVar.X(-762624091);
            nonFavorite = new VoiceFavoriteButtonState.Loading(ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getVoiceCellFeatured().m2206getFavoriteButtonActive0d7_KjU(), null);
            qVar.p(false);
        } else if (VoiceKt.isFavorited(voice)) {
            q qVar2 = (q) mVar;
            qVar2.X(-762378044);
            nonFavorite = new VoiceFavoriteButtonState.Favorite(ElevenLabsTheme.INSTANCE.getColor(qVar2, ElevenLabsTheme.$stable).getVoiceCellFeatured().m2206getFavoriteButtonActive0d7_KjU(), null);
            qVar2.p(false);
        } else {
            q qVar3 = (q) mVar;
            qVar3.X(-762143777);
            nonFavorite = new VoiceFavoriteButtonState.NonFavorite(ElevenLabsTheme.INSTANCE.getColor(qVar3, ElevenLabsTheme.$stable).getVoiceCellFeatured().m2207getFavoriteButtonInactive0d7_KjU(), null);
            qVar3.p(false);
        }
        VoiceFavoriteButtonState voiceFavoriteButtonState = nonFavorite;
        q qVar4 = (q) mVar;
        boolean f10 = qVar4.f(lVar) | qVar4.h(voice);
        Object L = qVar4.L();
        e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.b(lVar, voice, 1);
            qVar4.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean f11 = qVar4.f(lVar) | qVar4.h(voice);
        Object L2 = qVar4.L();
        if (f11 || L2 == eVar) {
            L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.b(lVar, voice, 2);
            qVar4.h0(L2);
        }
        ho.a aVar2 = (ho.a) L2;
        boolean f12 = qVar4.f(lVar) | qVar4.h(voice);
        Object L3 = qVar4.L();
        if (f12 || L3 == eVar) {
            L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.b(lVar, voice, 3);
            qVar4.h0(L3);
        }
        VoiceFeaturedCellKt.VoiceFeaturedCell(voiceId, name, subtitle, imageUrl, z6, z10, voiceFavoriteButtonState, aVar, aVar2, (ho.a) L3, useCase, c5, qVar4, 0, 0);
        return z.f31622a;
    }

    public static final z voicePickerExploreFeaturedSection$lambda$1$1$0$0(l lVar, Voice voice) {
        lVar.invoke(new VoicePickerSharedContract.Event.PreviewVoice(voice, true));
        return z.f31622a;
    }

    public static final z voicePickerExploreFeaturedSection$lambda$1$1$1$0(l lVar, Voice voice) {
        lVar.invoke(new VoicePickerSharedContract.Event.SelectVoice(voice, true));
        return z.f31622a;
    }

    public static final z voicePickerExploreFeaturedSection$lambda$1$1$2$0(l lVar, Voice voice) {
        Object addFavorite;
        if (VoiceKt.isFavorited(voice)) {
            addFavorite = new VoicePickerSharedContract.Event.ConfirmRemoveFavorite(voice);
        } else {
            addFavorite = new VoicePickerSharedContract.Event.AddFavorite(voice.getVoiceId());
        }
        lVar.invoke(addFavorite);
        return z.f31622a;
    }

    public static final Object voicePickerExploreFeaturedSection$lambda$2(String str, int i10, Voice voice) {
        voice.getClass();
        return f.j(str, "_voice_picker_view_type_voice_row_", voice.getVoiceId());
    }
}
