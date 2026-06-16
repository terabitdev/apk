package io.elevenlabs.highlighter;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import dc.c0;
import dc.e0;
import i1.d1;
import i1.f1;
import io.elevenlabs.domain.model.ChapterSlot;
import io.elevenlabs.ocr.OcrImportScreenKt;
import io.elevenlabs.ocr.OcrImportViewModel;
import io.elevenlabs.readerapp.core.extensions.AnimatedContentTransitionsKt;
import io.elevenlabs.readerapp.core.router.RouterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel;
import io.elevenlabs.ui.components.AnimatedDigitCounterKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14249b;

    public /* synthetic */ t(int i10, int i11) {
        this.f14248a = i11;
        this.f14249b = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        boolean applyContentAndCap$lambda$3;
        sn.z CameraView$lambda$22$0$10$0$5$0$0$0;
        f1 splashRoutes$lambda$0;
        d1 unauthorizedRoutes$lambda$0$0;
        d1 unauthorizedRoutes$lambda$0$3;
        d1 unauthorizedRoutes$lambda$0$6;
        sn.z AuthorProfileScreenUi$lambda$5$0$2$0$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$11$0$0;
        sn.z PlayerContentsScreenUI$lambda$3$0$0$0$0$0$0;
        VoicePickerSearchListContract.State loadVoices$lambda$2;
        sn.z VoicePickerSectionsLoadingList$lambda$0$0;
        VoiceDesignContract.State updatePreviewIndex$lambda$0;
        boolean z6;
        String Y;
        int i10;
        int i11;
        Integer valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12 = this.f14248a;
        int i13 = this.f14249b;
        switch (i12) {
            case 0:
                applyContentAndCap$lambda$3 = HighlighterKt.applyContentAndCap$lambda$3(i13, (ChapterSlot) obj);
                return Boolean.valueOf(applyContentAndCap$lambda$3);
            case 1:
                CameraView$lambda$22$0$10$0$5$0$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$0$0$0(i13, (OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$5$0$0$0;
            case 2:
                return Integer.valueOf(AnimatedContentTransitionsKt.b(i13, ((Integer) obj).intValue()));
            case 3:
                return Integer.valueOf(AnimatedContentTransitionsKt.d(i13, ((Integer) obj).intValue()));
            case 4:
                return Integer.valueOf(AnimatedContentTransitionsKt.c(i13, ((Integer) obj).intValue()));
            case 5:
                return Integer.valueOf(AnimatedContentTransitionsKt.a(i13, ((Integer) obj).intValue()));
            case 6:
                splashRoutes$lambda$0 = RouterKt.splashRoutes$lambda$0(i13, (i1.q) obj);
                return splashRoutes$lambda$0;
            case 7:
                unauthorizedRoutes$lambda$0$0 = RouterKt.unauthorizedRoutes$lambda$0$0(i13, (i1.q) obj);
                return unauthorizedRoutes$lambda$0$0;
            case 8:
                unauthorizedRoutes$lambda$0$3 = RouterKt.unauthorizedRoutes$lambda$0$3(i13, (i1.q) obj);
                return unauthorizedRoutes$lambda$0$3;
            case 9:
                unauthorizedRoutes$lambda$0$6 = RouterKt.unauthorizedRoutes$lambda$0$6(i13, (i1.q) obj);
                return unauthorizedRoutes$lambda$0$6;
            case 10:
                AuthorProfileScreenUi$lambda$5$0$2$0$0 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$5$0$2$0$0(i13, (AuthorProfileViewModel) obj);
                return AuthorProfileScreenUi$lambda$5$0$2$0$0;
            case 11:
                PlayerScreenUI$lambda$44$0$4$1$11$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$11$0$0(i13, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$4$1$11$0$0;
            case 12:
                PlayerContentsScreenUI$lambda$3$0$0$0$0$0$0 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$3$0$0$0$0$0$0(i13, (PlayerViewModel) obj);
                return PlayerContentsScreenUI$lambda$3$0$0$0$0$0$0;
            case 13:
                loadVoices$lambda$2 = VoicePickerSearchListViewModel.loadVoices$lambda$2(i13, (VoicePickerSearchListContract.State) obj);
                return loadVoices$lambda$2;
            case 14:
                VoicePickerSectionsLoadingList$lambda$0$0 = VoicePickerSectionsListKt.VoicePickerSectionsLoadingList$lambda$0$0(i13, (t1.t) obj);
                return VoicePickerSectionsLoadingList$lambda$0$0;
            case 15:
                updatePreviewIndex$lambda$0 = VoiceDesignViewModel.updatePreviewIndex$lambda$0(i13, (VoiceDesignContract.State) obj);
                return updatePreviewIndex$lambda$0;
            case 16:
                return Integer.valueOf(AnimatedDigitCounterKt.f(i13, ((Integer) obj).intValue()));
            case 17:
                return Integer.valueOf(AnimatedDigitCounterKt.g(i13, ((Integer) obj).intValue()));
            case 18:
                return Integer.valueOf(AnimatedDigitCounterKt.b(i13, ((Integer) obj).intValue()));
            case 19:
                return Integer.valueOf(AnimatedDigitCounterKt.a(i13, ((Integer) obj).intValue()));
            case 20:
                mb.a aVar = (mb.a) obj;
                aVar.getClass();
                mb.c l02 = aVar.l0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    l02.c(1, i13);
                    int F = ae.l.F(l02, "id");
                    int F2 = ae.l.F(l02, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int F3 = ae.l.F(l02, "worker_class_name");
                    int F4 = ae.l.F(l02, "input_merger_class_name");
                    int F5 = ae.l.F(l02, "input");
                    int F6 = ae.l.F(l02, "output");
                    int F7 = ae.l.F(l02, "initial_delay");
                    int F8 = ae.l.F(l02, "interval_duration");
                    int F9 = ae.l.F(l02, "flex_duration");
                    int F10 = ae.l.F(l02, "run_attempt_count");
                    int F11 = ae.l.F(l02, "backoff_policy");
                    int F12 = ae.l.F(l02, "backoff_delay_duration");
                    int F13 = ae.l.F(l02, "last_enqueue_time");
                    int F14 = ae.l.F(l02, "minimum_retention_duration");
                    int F15 = ae.l.F(l02, "schedule_requested_at");
                    int F16 = ae.l.F(l02, "run_in_foreground");
                    int F17 = ae.l.F(l02, "out_of_quota_policy");
                    int F18 = ae.l.F(l02, "period_count");
                    int F19 = ae.l.F(l02, "generation");
                    int F20 = ae.l.F(l02, "next_schedule_time_override");
                    int F21 = ae.l.F(l02, "next_schedule_time_override_generation");
                    int F22 = ae.l.F(l02, "stop_reason");
                    int F23 = ae.l.F(l02, "trace_tag");
                    int F24 = ae.l.F(l02, "backoff_on_system_interruptions");
                    int F25 = ae.l.F(l02, "required_network_type");
                    int F26 = ae.l.F(l02, "required_network_request");
                    int F27 = ae.l.F(l02, "requires_charging");
                    int F28 = ae.l.F(l02, "requires_device_idle");
                    int F29 = ae.l.F(l02, "requires_battery_not_low");
                    int F30 = ae.l.F(l02, "requires_storage_not_low");
                    int F31 = ae.l.F(l02, "trigger_content_update_delay");
                    int F32 = ae.l.F(l02, "trigger_max_content_delay");
                    int F33 = ae.l.F(l02, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (l02.h0()) {
                        String Y2 = l02.Y(F);
                        ArrayList arrayList2 = arrayList;
                        int i14 = F;
                        e0 L = a.a.L((int) l02.getLong(F2));
                        String Y3 = l02.Y(F3);
                        String Y4 = l02.Y(F4);
                        byte[] blob = l02.getBlob(F5);
                        dc.h hVar = dc.h.f7889b;
                        dc.h v9 = ec.t.v(blob);
                        dc.h v10 = ec.t.v(l02.getBlob(F6));
                        long j4 = l02.getLong(F7);
                        long j10 = l02.getLong(F8);
                        long j11 = l02.getLong(F9);
                        int i15 = (int) l02.getLong(F10);
                        dc.a I = a.a.I((int) l02.getLong(F11));
                        long j12 = l02.getLong(F12);
                        long j13 = l02.getLong(F13);
                        long j14 = l02.getLong(F14);
                        int i16 = F15;
                        long j15 = l02.getLong(i16);
                        int i17 = F14;
                        int i18 = F16;
                        if (((int) l02.getLong(i18)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        int i19 = F17;
                        c0 K = a.a.K((int) l02.getLong(i19));
                        int i20 = F2;
                        int i21 = F18;
                        int i22 = F3;
                        int i23 = (int) l02.getLong(i21);
                        int i24 = F19;
                        int i25 = (int) l02.getLong(i24);
                        int i26 = F20;
                        long j16 = l02.getLong(i26);
                        int i27 = F21;
                        int i28 = (int) l02.getLong(i27);
                        int i29 = F22;
                        int i30 = (int) l02.getLong(i29);
                        int i31 = F23;
                        Boolean bool = null;
                        if (l02.isNull(i31)) {
                            Y = null;
                        } else {
                            Y = l02.Y(i31);
                        }
                        int i32 = F24;
                        if (l02.isNull(i32)) {
                            i10 = i31;
                            i11 = i29;
                            valueOf = null;
                        } else {
                            i10 = i31;
                            i11 = i29;
                            valueOf = Integer.valueOf((int) l02.getLong(i32));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            bool = Boolean.valueOf(z14);
                        }
                        int i33 = F25;
                        Boolean bool2 = bool;
                        dc.w J = a.a.J((int) l02.getLong(i33));
                        int i34 = F26;
                        mc.e Y5 = a.a.Y(l02.getBlob(i34));
                        int i35 = F27;
                        if (((int) l02.getLong(i35)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i36 = F28;
                        if (((int) l02.getLong(i36)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i37 = F29;
                        if (((int) l02.getLong(i37)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        F29 = i37;
                        int i38 = F30;
                        if (((int) l02.getLong(i38)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i39 = F31;
                        int i40 = F32;
                        F31 = i39;
                        int i41 = F33;
                        lc.o oVar = new lc.o(Y2, L, Y3, Y4, v9, v10, j4, j10, j11, new dc.e(Y5, J, z10, z11, z12, z13, l02.getLong(i39), l02.getLong(i40), a.a.g(l02.getBlob(i41))), i15, I, j12, j13, j14, j15, z6, K, i23, i25, j16, i28, i30, Y, bool2);
                        F33 = i41;
                        F32 = i40;
                        arrayList = arrayList2;
                        arrayList.add(oVar);
                        F30 = i38;
                        F14 = i17;
                        F15 = i16;
                        F16 = i18;
                        F17 = i19;
                        F2 = i20;
                        F20 = i26;
                        F21 = i27;
                        F22 = i11;
                        F23 = i10;
                        F24 = i32;
                        F25 = i33;
                        F19 = i24;
                        F27 = i35;
                        F26 = i34;
                        F28 = i36;
                        F3 = i22;
                        F = i14;
                        F18 = i21;
                    }
                    l02.close();
                    return arrayList;
                } catch (Throwable th) {
                    l02.close();
                    throw th;
                }
            case 21:
                ((Integer) obj).intValue();
                return Integer.valueOf(i13);
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(j0.c.k("Collection doesn't contain element at index ", i13, '.'));
        }
    }
}
