package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import a2.o0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import fm.g;
import ho.l;
import i3.t;
import i4.j1;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.model.TtsTimeConversionKt;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.SmoothProgressSliderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.ContentState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.format.DurationFormatterKt;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p4.b0;
import p4.f;
import p4.y;
import r1.p2;
import s4.y0;
import sn.z;
import t2.u;
import tn.o;
import u2.e1;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.w0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0085\u0001\u0010\u0010\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010!\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010%\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&¨\u0006(²\u0006\u000e\u0010'\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;", "contentState", "", "sleepTimerRemainingSeconds", "Lio/elevenlabs/domain/model/SkipDuration;", "forwardSeekDuration", "backwardSeekDuration", "Lkotlin/Function0;", "Lsn/z;", "onSliderSeekStarted", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "onSeek", "onSeekEnded", "onSeekBack", "onSeekForward", "PlayerSlider", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;Ljava/lang/Long;Lio/elevenlabs/domain/model/SkipDuration;Lio/elevenlabs/domain/model/SkipDuration;Lho/a;Lho/l;Lho/l;Lho/a;Lho/a;Lu2/m;I)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/SliderData;", "calculateSliderData", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/SliderData;", "Lio/elevenlabs/domain/model/Chapter;", "resolveCurrentAudioChapter", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;)Lio/elevenlabs/domain/model/Chapter;", "chapter", "", "isMedia", "", "chapterTimelineSeconds", "(Lio/elevenlabs/domain/model/Chapter;Z)D", "", "chapters", "totalCharCount", "readTimelineSeconds", "(Ljava/util/List;JZ)D", "", "progress", "progressToPosition", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;F)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "localProgress", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerSliderKt {
    public static final void PlayerSlider(ContentState contentState, Long l4, SkipDuration skipDuration, SkipDuration skipDuration2, ho.a aVar, l lVar, l lVar2, ho.a aVar2, ho.a aVar3, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        skipDuration.getClass();
        skipDuration2.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        aVar3.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1716993204);
        if ((i10 & 6) == 0) {
            if (qVar2.h(contentState)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i11 = i20 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(l4)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i11 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.d(skipDuration.ordinal())) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i11 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.d(skipDuration2.ordinal())) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(lVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i11 |= i15;
        }
        if ((1572864 & i10) == 0) {
            if (qVar2.h(lVar2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((12582912 & i10) == 0) {
            if (qVar2.h(aVar2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i11 |= i13;
        }
        if ((100663296 & i10) == 0) {
            if (qVar2.h(aVar3)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        boolean z13 = false;
        if ((38347923 & i11) != 38347922) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            SliderData calculateSliderData = calculateSliderData(contentState);
            boolean c5 = qVar2.c(calculateSliderData.getProgress());
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (c5 || L == eVar) {
                e1 e1Var = new e1(calculateSliderData.getProgress());
                qVar2.h0(e1Var);
                L = e1Var;
            }
            w0 w0Var = (w0) L;
            if (l4 != null) {
                str = DurationFormatterKt.formatTimeRemainingShort(l4.longValue());
            } else {
                str = null;
            }
            String str2 = str;
            String Q = kj.c.Q(R.string.player_accessibility_progress, new Object[]{calculateSliderData.getCurrentChapterTime(), calculateSliderData.getTotalChapterTime()}, qVar2);
            String Q2 = kj.c.Q(R.string.player_accessibility_progress_state, new Object[]{calculateSliderData.getCurrentChapterTime(), calculateSliderData.getTotalChapterTime()}, qVar2);
            String Q3 = kj.c.Q(R.string.player_accessibility_seek_back_seconds, new Object[]{Integer.valueOf(skipDuration2.getSeconds())}, qVar2);
            int i21 = i11;
            String Q4 = kj.c.Q(R.string.player_accessibility_seek_forward_seconds, new Object[]{Integer.valueOf(skipDuration.getSeconds())}, qVar2);
            if ((i21 & 29360128) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L2 = qVar2.L();
            if (z10 || L2 == eVar) {
                L2 = new g(21, aVar2);
                qVar2.h0(L2);
            }
            f fVar = new f(Q3, (ho.a) L2);
            if ((i21 & 234881024) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L3 = qVar2.L();
            if (z11 || L3 == eVar) {
                L3 = new g(22, aVar3);
                qVar2.h0(L3);
            }
            List I = ig.f.I(fVar, new f(Q4, (ho.a) L3));
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i22 = EchoTheme.$stable;
            float x22 = echoTheme.getSpacings(qVar2, i22).getX2();
            float x23 = echoTheme.getSpacings(qVar2, i22).getX2();
            float f10 = 16;
            y0 a10 = y0.a(echoTheme.getTypography(qVar2, i22).getXsRegular400(qVar2, EchoThemeTypography.$stable), echoTheme.getColors(qVar2, i22).getText().getQuaternary(qVar2, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
            float i23 = ((h5.c) qVar2.j(j1.f13129h)).i(a10.f31174a.f31102b);
            String Q5 = kj.c.Q(R.string.common_time_left, new Object[]{calculateSliderData.getRemainingReadTime()}, qVar2);
            float PlayerSlider$lambda$1 = PlayerSlider$lambda$1(w0Var);
            String currentChapterTime = calculateSliderData.getCurrentChapterTime();
            String remainingChapterTime = calculateSliderData.getRemainingChapterTime();
            boolean isCurrentChapterLast = calculateSliderData.isCurrentChapterLast();
            t f11 = p2.f(r1.d.I(i3.q.f13017a, echoTheme.getSpacings(qVar2, i22).getX5(), x22, echoTheme.getSpacings(qVar2, i22).getX5(), u.P, 8), x22 + i23 + x23 + f10);
            boolean f12 = qVar2.f(Q) | qVar2.f(Q2) | qVar2.h(I);
            Object L4 = qVar2.L();
            if (f12 || L4 == eVar) {
                L4 = new o0(Q, Q2, I, 25);
                qVar2.h0(L4);
            }
            t c10 = p4.q.c(f11, true, (l) L4);
            boolean f13 = qVar2.f(w0Var) | qVar2.h(contentState);
            if ((458752 & i21) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = f13 | z12;
            Object L5 = qVar2.L();
            if (z14 || L5 == eVar) {
                L5 = new o0(contentState, w0Var, lVar, 26);
                qVar2.h0(L5);
            }
            l lVar3 = (l) L5;
            boolean h10 = qVar2.h(contentState) | qVar2.f(w0Var);
            if ((3670016 & i21) == 1048576) {
                z13 = true;
            }
            boolean z15 = h10 | z13;
            Object L6 = qVar2.L();
            if (z15 || L6 == eVar) {
                L6 = new c3.b(contentState, w0Var, lVar2, 22);
                qVar2.h0(L6);
            }
            qVar = qVar2;
            SmoothProgressSliderKt.m1094SmoothProgressSliderOXtVwFM(PlayerSlider$lambda$1, lVar3, (ho.a) L6, aVar, c10, false, 0L, 0L, a10, currentChapterTime, remainingChapterTime, Q5, isCurrentChapterLast, str2, u.P, f10, x23, qVar, (i21 >> 3) & 7168, 196608, 16608);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.g(contentState, l4, skipDuration, skipDuration2, aVar, lVar, lVar2, aVar2, aVar3, i10, 2);
        }
    }

    private static final float PlayerSlider$lambda$1(w0 w0Var) {
        return ((e1) w0Var).h();
    }

    private static final void PlayerSlider$lambda$2(w0 w0Var, float f10) {
        ((e1) w0Var).i(f10);
    }

    public static final boolean PlayerSlider$lambda$3$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final boolean PlayerSlider$lambda$4$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final z PlayerSlider$lambda$6$0(String str, String str2, List list, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.l(str2, b0Var);
        y.e(b0Var, list);
        return z.f31622a;
    }

    public static final z PlayerSlider$lambda$7$0(ContentState contentState, w0 w0Var, l lVar, float f10) {
        PlayerSlider$lambda$2(w0Var, f10);
        PlaybackPosition progressToPosition = progressToPosition(contentState, f10);
        if (progressToPosition != null) {
            lVar.invoke(progressToPosition);
        }
        return z.f31622a;
    }

    public static final z PlayerSlider$lambda$8$0(ContentState contentState, w0 w0Var, l lVar) {
        PlaybackPosition progressToPosition = progressToPosition(contentState, PlayerSlider$lambda$1(w0Var));
        if (progressToPosition != null) {
            lVar.invoke(progressToPosition);
        }
        return z.f31622a;
    }

    public static final z PlayerSlider$lambda$9(ContentState contentState, Long l4, SkipDuration skipDuration, SkipDuration skipDuration2, ho.a aVar, l lVar, l lVar2, ho.a aVar2, ho.a aVar3, int i10, m mVar, int i11) {
        PlayerSlider(contentState, l4, skipDuration, skipDuration2, aVar, lVar, lVar2, aVar2, aVar3, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static /* synthetic */ z b(String str, String str2, List list, b0 b0Var) {
        return PlayerSlider$lambda$6$0(str, str2, list, b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0185, code lost:
    
        if (r3 == null) goto L163;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SliderData calculateSliderData(ContentState contentState) {
        PlaybackPosition playbackPosition;
        double d10;
        String formatTimeRemainingShort;
        Integer num;
        double d11;
        Double durationSeconds;
        double d12;
        double charsToSeconds;
        Integer num2 = null;
        if (contentState != null) {
            playbackPosition = contentState.getPosition();
        } else {
            playbackPosition = null;
        }
        double d13 = 0.0d;
        if (playbackPosition instanceof PlaybackPosition.Tts) {
            List<Chapter> chapters = contentState.getReadMeta().getChapters();
            PlaybackPosition.Tts tts = (PlaybackPosition.Tts) playbackPosition;
            int findTtsChapterIndex = ChapterUtilsKt.findTtsChapterIndex(chapters, tts.getOffset());
            Chapter chapter = (Chapter) o.z0(findTtsChapterIndex, chapters);
            long charCount = contentState.getReadMeta().getCharCount();
            boolean isMediaType = ReadMetaKt.isMediaType(contentState.getReadMeta());
            if (chapter != null) {
                long j4 = 0;
                if (chapter.getCharCount() > 0) {
                    long offset = tts.getOffset() - chapter.getStartingCharOffset();
                    if (offset >= 0) {
                        j4 = offset;
                    }
                    float l4 = ae.l.l(((float) j4) / ((float) chapter.getCharCount()), u.P, 1.0f);
                    double chapterTimelineSeconds = chapterTimelineSeconds(chapter, isMediaType);
                    double d14 = l4 * chapterTimelineSeconds;
                    double readTimelineSeconds = readTimelineSeconds(chapters, charCount, isMediaType);
                    boolean z6 = true;
                    if (isMediaType) {
                        Iterator it = o.b1(chapters, findTtsChapterIndex).iterator();
                        charsToSeconds = 0.0d;
                        while (it.hasNext()) {
                            charsToSeconds += chapterTimelineSeconds((Chapter) it.next(), true);
                        }
                    } else {
                        charsToSeconds = TtsTimeConversionKt.charsToSeconds(chapter.getStartingCharOffset());
                    }
                    double d15 = charsToSeconds + d14;
                    String formatSecondsAsTime = DurationFormatterKt.formatSecondsAsTime(d14);
                    double d16 = chapterTimelineSeconds - d14;
                    if (d16 < 0.0d) {
                        d16 = 0.0d;
                    }
                    String formatSecondsAsTime2 = DurationFormatterKt.formatSecondsAsTime(d16);
                    String formatSecondsAsTime3 = DurationFormatterKt.formatSecondsAsTime(chapterTimelineSeconds);
                    if (findTtsChapterIndex != chapters.size() - 1) {
                        z6 = false;
                    }
                    double d17 = readTimelineSeconds - d15;
                    if (d17 >= 0.0d) {
                        d13 = d17;
                    }
                    return new SliderData(l4, formatSecondsAsTime, formatSecondsAsTime2, formatSecondsAsTime3, z6, DurationFormatterKt.formatTimeRemainingShort((long) d13));
                }
            }
            double charsToSeconds2 = TtsTimeConversionKt.charsToSeconds(charCount);
            double charsToSeconds3 = TtsTimeConversionKt.charsToSeconds(tts.getOffset());
            float offset2 = (((float) tts.getOffset()) + 1.0f) / (((float) charCount) + 1.0f);
            String formatSecondsAsTime4 = DurationFormatterKt.formatSecondsAsTime(charsToSeconds3);
            double d18 = charsToSeconds2 - charsToSeconds3;
            if (d18 < 0.0d) {
                d12 = 0.0d;
            } else {
                d12 = d18;
            }
            String formatSecondsAsTime5 = DurationFormatterKt.formatSecondsAsTime(d12);
            String formatSecondsAsTime6 = DurationFormatterKt.formatSecondsAsTime(charsToSeconds2);
            if (d18 >= 0.0d) {
                d13 = d18;
            }
            return new SliderData(offset2, formatSecondsAsTime4, formatSecondsAsTime5, formatSecondsAsTime6, true, DurationFormatterKt.formatTimeRemainingShort((long) d13));
        }
        if (playbackPosition instanceof PlaybackPosition.AudioOnly) {
            Chapter resolveCurrentAudioChapter = resolveCurrentAudioChapter(contentState);
            if (resolveCurrentAudioChapter != null && (durationSeconds = resolveCurrentAudioChapter.getDurationSeconds()) != null) {
                d10 = durationSeconds.doubleValue();
            } else {
                d10 = 1.0d;
            }
            PlaybackPosition.AudioOnly audioOnly = (PlaybackPosition.AudioOnly) playbackPosition;
            float l7 = ae.l.l((float) (audioOnly.getSeconds() / d10), u.P, 1.0f);
            String formatSecondsAsTime7 = DurationFormatterKt.formatSecondsAsTime(audioOnly.getSeconds());
            String formatSecondsAsTime8 = DurationFormatterKt.formatSecondsAsTime(d10 - audioOnly.getSeconds());
            String formatSecondsAsTime9 = DurationFormatterKt.formatSecondsAsTime(d10);
            if (resolveCurrentAudioChapter != null) {
                Iterator<T> it2 = contentState.getReadMeta().getChapters().iterator();
                double d19 = 0.0d;
                while (it2.hasNext()) {
                    Double durationSeconds2 = ((Chapter) it2.next()).getDurationSeconds();
                    if (durationSeconds2 != null) {
                        d11 = durationSeconds2.doubleValue();
                    } else {
                        d11 = 0.0d;
                    }
                    d19 += d11;
                }
                double seconds = d19 - (audioOnly.getSeconds() + ChapterUtilsKt.getCumulativeChapterDuration(contentState.getReadMeta().getChapters(), resolveCurrentAudioChapter.getIndex()));
                if (seconds >= 0.0d) {
                    d13 = seconds;
                }
                formatTimeRemainingShort = DurationFormatterKt.formatTimeRemainingShort((long) d13);
            }
            formatTimeRemainingShort = DurationFormatterKt.formatTimeRemainingShort((long) (d10 - audioOnly.getSeconds()));
            String str = formatTimeRemainingShort;
            if (resolveCurrentAudioChapter != null) {
                num = Integer.valueOf(resolveCurrentAudioChapter.getIndex());
            } else {
                num = null;
            }
            Chapter chapter2 = (Chapter) o.H0(contentState.getReadMeta().getChapters());
            if (chapter2 != null) {
                num2 = Integer.valueOf(chapter2.getIndex());
            }
            return new SliderData(l7, formatSecondsAsTime7, formatSecondsAsTime8, formatSecondsAsTime9, kotlin.jvm.internal.m.c(num, num2), str);
        }
        if (playbackPosition == null) {
            return new SliderData(u.P, "0:00", "0:00", "0:00", true, "0s");
        }
        c6.p();
        return null;
    }

    private static final double chapterTimelineSeconds(Chapter chapter, boolean z6) {
        if (z6) {
            Double durationSeconds = chapter.getDurationSeconds();
            if (durationSeconds != null) {
                return durationSeconds.doubleValue();
            }
            return TtsTimeConversionKt.charsToSeconds(chapter.getCharCount());
        }
        return TtsTimeConversionKt.charsToSeconds(chapter.getCharCount());
    }

    public static /* synthetic */ z e(ContentState contentState, w0 w0Var, l lVar, float f10) {
        return PlayerSlider$lambda$7$0(contentState, w0Var, lVar, f10);
    }

    private static final PlaybackPosition progressToPosition(ContentState contentState, float f10) {
        PlaybackPosition playbackPosition;
        double d10;
        Double durationSeconds;
        if (contentState != null) {
            playbackPosition = contentState.getPosition();
        } else {
            playbackPosition = null;
        }
        if (playbackPosition instanceof PlaybackPosition.Tts) {
            List<Chapter> chapters = contentState.getReadMeta().getChapters();
            Chapter chapter = (Chapter) o.z0(ChapterUtilsKt.findTtsChapterIndex(chapters, ((PlaybackPosition.Tts) playbackPosition).getOffset()), chapters);
            if (chapter != null) {
                return new PlaybackPosition.Tts(ae.l.o(jo.a.z(f10 * ((float) chapter.getCharCount())) + chapter.getStartingCharOffset(), chapter.getStartingCharOffset(), chapter.getCharCount() + chapter.getStartingCharOffset()));
            }
            return new PlaybackPosition.Tts(jo.a.z(f10 * ((float) contentState.getReadMeta().getCharCount())));
        }
        if (playbackPosition instanceof PlaybackPosition.AudioOnly) {
            Chapter resolveCurrentAudioChapter = resolveCurrentAudioChapter(contentState);
            if (resolveCurrentAudioChapter != null && (durationSeconds = resolveCurrentAudioChapter.getDurationSeconds()) != null) {
                d10 = durationSeconds.doubleValue();
            } else {
                d10 = 0.0d;
            }
            return new PlaybackPosition.AudioOnly(f10 * d10);
        }
        if (playbackPosition == null) {
            return null;
        }
        c6.p();
        return null;
    }

    private static final double readTimelineSeconds(List<Chapter> list, long j4, boolean z6) {
        if (z6) {
            Iterator<T> it = list.iterator();
            double d10 = 0.0d;
            while (it.hasNext()) {
                d10 += chapterTimelineSeconds((Chapter) it.next(), true);
            }
            return d10;
        }
        return TtsTimeConversionKt.charsToSeconds(j4);
    }

    private static final Chapter resolveCurrentAudioChapter(ContentState contentState) {
        Object obj;
        Chapter currentChapter = contentState.getCurrentChapter();
        if (currentChapter == null) {
            Iterator<T> it = contentState.getReadMeta().getChapters().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.m.c(((Chapter) obj).getAudioFileNumber(), contentState.getReadMeta().getLastListenedAudioFileNumber())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Chapter chapter = (Chapter) obj;
            if (chapter == null) {
                return (Chapter) o.y0(contentState.getReadMeta().getChapters());
            }
            return chapter;
        }
        return currentChapter;
    }
}
