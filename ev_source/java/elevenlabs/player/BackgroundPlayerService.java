package io.elevenlabs.player;

import a7.u;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.room.m0;
import androidx.room.y;
import c8.l;
import com.google.protobuf.c6;
import f2.p;
import fr.d0;
import fr.g0;
import gh.l0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.HighlighterPositionConverter;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.domain.model.PlaybackSource;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CharacterReportingService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import io.elevenlabs.domain.services.PersistentPlayerQueueService;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VibrationService;
import io.elevenlabs.domain.services.player.PlayerConfiguration;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.domain.usecase.IsAudioBookmarksAllowedUseCase;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.player.TriggerAssistantFromMediaButtonUseCase;
import io.elevenlabs.player.audio.LoopingAudioPlayer;
import io.elevenlabs.player.audio.SleepTimerFadeOut;
import io.elevenlabs.player.consumption.ConsumptionCoordinator;
import io.elevenlabs.player.consumption.ConsumptionPlayerListener;
import io.elevenlabs.player.media.MediaItemCreator;
import ir.h;
import ir.i;
import ir.i1;
import ir.j1;
import ir.r;
import ja.g4;
import ja.h2;
import ja.z1;
import ja.z2;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import sn.k;
import w7.a1;
import w7.b1;
import w7.d1;
import w7.e1;
import w7.f1;
import w7.f2;
import w7.g1;
import w7.h1;
import w7.o;
import w7.o1;
import w7.r0;
import w7.r1;
import w7.u0;
import w7.w0;
import w7.w1;
import w7.y1;
import xq.g;
import y5.s;
import y5.v;
import y5.w;
import y5.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000ð\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f*\u0002\u0084\u0001\b\u0007\u0018\u0000 ÷\u00022\u00020\u0001:\b÷\u0002ø\u0002ù\u0002ú\u0002B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u0003J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u0003J0\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eH\u0083@¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'J8\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eH\u0083@¢\u0006\u0004\b(\u0010)JG\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010/\u001a\u00020.2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00104J-\u00108\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020+2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f06H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b;\u0010\u0003J$\u0010<\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u0004H\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010\u0003J\u001a\u0010C\u001a\u00020\u00042\b\u0010B\u001a\u0004\u0018\u00010AH\u0082@¢\u0006\u0004\bC\u0010DJ-\u0010J\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u00102\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ'\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ%\u0010U\u001a\b\u0012\u0004\u0012\u00020R0\u001e2\u0006\u0010%\u001a\u00020$2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u001cH\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020Z2\u0006\u0010%\u001a\u00020$2\u0006\u0010Y\u001a\u00020.H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020HH\u0002¢\u0006\u0004\b]\u0010^J%\u0010a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020`0_2\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0004H\u0083@¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ%\u0010p\u001a\b\u0012\u0004\u0012\u00020o0n2\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020kH\u0003¢\u0006\u0004\bp\u0010qJ!\u0010t\u001a\u0004\u0018\u00010o2\u0006\u0010r\u001a\u00020k2\u0006\u0010s\u001a\u00020+H\u0003¢\u0006\u0004\bt\u0010uJ\u001f\u0010w\u001a\u00020\u00042\u0006\u0010r\u001a\u00020k2\u0006\u0010v\u001a\u00020\u0010H\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020.2\u0006\u0010y\u001a\u00020$H\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020.2\u0006\u0010y\u001a\u00020$H\u0002¢\u0006\u0004\b|\u0010{J\u0017\u0010~\u001a\u00020+2\u0006\u0010}\u001a\u00020.H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010}\u001a\u00020.H\u0082@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020\u0004H\u0082@¢\u0006\u0005\b\u0082\u0001\u0010dJ\u0012\u0010\u0083\u0001\u001a\u00020\u0004H\u0082@¢\u0006\u0005\b\u0083\u0001\u0010dJ\u0013\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010 \u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010§\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010®\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010µ\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010¼\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ã\u0001\u001a\u00030Â\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R*\u0010Ê\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010Ø\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010ß\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010æ\u0001\u001a\u00030å\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R*\u0010í\u0001\u001a\u00030ì\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R*\u0010ô\u0001\u001a\u00030ó\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R*\u0010û\u0001\u001a\u00030ú\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R*\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R*\u0010\u0089\u0002\u001a\u00030\u0088\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R*\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R*\u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R*\u0010\u009e\u0002\u001a\u00030\u009d\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002\"\u0006\b¢\u0002\u0010£\u0002R*\u0010¥\u0002\u001a\u00030¤\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R*\u0010¬\u0002\u001a\u00030«\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¬\u0002\u0010\u00ad\u0002\u001a\u0006\b¬\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R*\u0010²\u0002\u001a\u00030±\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0002\u0010³\u0002\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0006\b¶\u0002\u0010·\u0002R*\u0010¹\u0002\u001a\u00030¸\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0002\u0010º\u0002\u001a\u0006\b»\u0002\u0010¼\u0002\"\u0006\b½\u0002\u0010¾\u0002R*\u0010À\u0002\u001a\u00030¿\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R*\u0010Ç\u0002\u001a\u00030Æ\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÇ\u0002\u0010È\u0002\u001a\u0006\bÉ\u0002\u0010Ê\u0002\"\u0006\bË\u0002\u0010Ì\u0002R\u0017\u0010Í\u0002\u001a\u00020\u00108\u0002X\u0082D¢\u0006\b\n\u0006\bÍ\u0002\u0010Î\u0002R\u001c\u0010-\u001a\t\u0012\u0004\u0012\u00020+0Ï\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010Ð\u0002R\u001c\u0010/\u001a\t\u0012\u0004\u0012\u00020.0Ï\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010Ð\u0002R \u0010Ñ\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ï\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0002\u0010Ð\u0002R\u0018\u0010Ó\u0002\u001a\u00030Ò\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ò\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0002\u0010Ô\u0002R\u0019\u0010Ö\u0002\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u0019\u0010Ø\u0002\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0002\u0010Ù\u0002R\u001b\u0010Ú\u0002\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010Î\u0002R\u001f\u0010Ý\u0002\u001a\n\u0012\u0005\u0012\u00030Ü\u00020Û\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R\u001b\u0010ß\u0002\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0002\u0010Î\u0002R\u001b\u0010à\u0002\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\u0019\u0010â\u0002\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0002\u0010ã\u0002R\u001a\u0010å\u0002\u001a\u00030ä\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bå\u0002\u0010æ\u0002R\u001a\u0010è\u0002\u001a\u00030ç\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u001b\u0010ê\u0002\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0002\u0010ë\u0002R\u001a\u0010í\u0002\u001a\u00030ì\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bí\u0002\u0010î\u0002R\u001a\u0010ð\u0002\u001a\u00030ï\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0002\u0010ñ\u0002R\u0019\u0010ò\u0002\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0002\u0010ó\u0002R\u0019\u0010ô\u0002\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0002\u0010ó\u0002R\u0019\u0010õ\u0002\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0002\u0010ó\u0002R\u0019\u0010ö\u0002\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0002\u0010ó\u0002¨\u0006û\u0002"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService;", "Lja/b3;", "<init>", "()V", "Lsn/z;", "onCreate", "Lja/w1;", "controllerInfo", "Lja/z1;", "onGetSession", "(Lja/w1;)Lja/z1;", "Landroid/content/Intent;", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "onDestroy", "", "readId", "Landroid/app/PendingIntent;", "getSingleTopActivity", "(Ljava/lang/String;)Landroid/app/PendingIntent;", "initializeMediaSession", "observePlayerPreferences", "observeAuthState", "observeSleepTimer", "observeSoundscape", "observeQueueState", "observeMediaItemChanges", "Lw7/r0;", "item", "Lir/i;", "", "emptyOffsetFlow", "", "trackPositionForItem", "(Lw7/r0;Lir/i;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "audioPositionTrackingFlow", "(Lw7/r0;Lio/elevenlabs/domain/model/ReadMeta;)Lir/i;", "ttsPositionTrackingFlow", "(Lw7/r0;Lio/elevenlabs/domain/model/ReadMeta;Lir/i;Lwn/c;)Ljava/lang/Object;", "initialOffset", "", "hasSubscribers", "isPlaying", "", "playbackState", "ttsCharacterOffsetFlow", "(JZZILir/i;)Lir/i;", "seconds", "seekBySeconds", "(I)V", "playWhenReady", "Lkotlin/Function1;", "getOffset", "seekToTtsOffset", "(ZLho/l;)V", "triggerAssistantFromMediaButton", "createBookmarkFromMediaButton", "resolveBookmarkCharOffset", "(Ljava/lang/String;Lio/elevenlabs/domain/model/ReadMeta;Lwn/c;)Ljava/lang/Object;", "showBookmarkSuccessToast", "showBookmarkErrorToast", "showBookmarkNotSupportedToast", "Ljava/util/Date;", "date", "saveSleepTimerInMediaSession", "(Ljava/util/Date;Lwn/c;)Ljava/lang/Object;", "id", "Ljava/io/File;", "file", "", "mixingLevel", "updateSoundscapeSessionExtras", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Float;)V", "startOffset", "Lxq/b;", "delayDuration", "currentCharacterOffset-HG0u8IE", "(JJ)Lir/i;", "currentCharacterOffset", "Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;", "currentAudioPosition-HG0u8IE", "(Lio/elevenlabs/domain/model/ReadMeta;J)Lir/i;", "currentAudioPosition", "mediaItem", "prepareInitialChapterSeek", "(Lw7/r0;)V", "chapterIndex", "Lio/elevenlabs/domain/model/PlaybackSource;", "resolvePlaybackSource", "(Lio/elevenlabs/domain/model/ReadMeta;I)Lio/elevenlabs/domain/model/PlaybackSource;", "getPlaybackSpeed", "()F", "Lsn/k;", "", "getCurrentPlaybackSnapshot", "(Lio/elevenlabs/domain/model/ReadMeta;)Lsn/k;", "handlePlaybackEnded", "(Lwn/c;)Ljava/lang/Object;", "fireEndOfFileAnalytics", "(Ljava/lang/String;)V", "Ly5/w;", "notificationManagerCompat", "ensureNotificationChannel", "(Ly5/w;)V", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "forwardAction", "backAction", "", "Lja/d;", "buildMediaButtons", "(Lio/elevenlabs/domain/model/BluetoothButtonAction;Lio/elevenlabs/domain/model/BluetoothButtonAction;)Ljava/util/List;", "action", "isForward", "getButtonForAction", "(Lio/elevenlabs/domain/model/BluetoothButtonAction;Z)Lja/d;", "buttonType", "executeButtonAction", "(Lio/elevenlabs/domain/model/BluetoothButtonAction;Ljava/lang/String;)V", "read", "getCurrentTtsChapterIndex", "(Lio/elevenlabs/domain/model/ReadMeta;)I", "getCurrentWindowIndex", "direction", "navigateAudioChapter", "(I)Z", "navigateChapter", "(ILwn/c;)Ljava/lang/Object;", "handleNextChapter", "handlePreviousChapter", "io/elevenlabs/player/BackgroundPlayerService$createMediaSessionCallback$1", "createMediaSessionCallback", "()Lio/elevenlabs/player/BackgroundPlayerService$createMediaSessionCallback$1;", "Lfr/d0;", "scope", "Lfr/d0;", "Lio/elevenlabs/domain/services/player/PlayerConfiguration;", "playerConfiguration", "Lio/elevenlabs/domain/services/player/PlayerConfiguration;", "getPlayerConfiguration", "()Lio/elevenlabs/domain/services/player/PlayerConfiguration;", "setPlayerConfiguration", "(Lio/elevenlabs/domain/services/player/PlayerConfiguration;)V", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "getDispatcherFactory", "()Lio/elevenlabs/domain/DispatcherFactory;", "setDispatcherFactory", "(Lio/elevenlabs/domain/DispatcherFactory;)V", "Lio/elevenlabs/domain/services/StreamingService;", "streamingService", "Lio/elevenlabs/domain/services/StreamingService;", "getStreamingService", "()Lio/elevenlabs/domain/services/StreamingService;", "setStreamingService", "(Lio/elevenlabs/domain/services/StreamingService;)V", "Lw7/h1;", "player", "Lw7/h1;", "getPlayer", "()Lw7/h1;", "setPlayer", "(Lw7/h1;)V", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/ReadsService;", "getReadsService", "()Lio/elevenlabs/domain/services/ReadsService;", "setReadsService", "(Lio/elevenlabs/domain/services/ReadsService;)V", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/services/AuthService;", "getAuthService", "()Lio/elevenlabs/domain/services/AuthService;", "setAuthService", "(Lio/elevenlabs/domain/services/AuthService;)V", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "setLogger", "(Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "getCurrentTimeUseCase", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "getGetCurrentTimeUseCase", "()Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "setGetCurrentTimeUseCase", "(Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;)V", "Lio/elevenlabs/domain/services/CharacterReportingService;", "characterReportingService", "Lio/elevenlabs/domain/services/CharacterReportingService;", "getCharacterReportingService", "()Lio/elevenlabs/domain/services/CharacterReportingService;", "setCharacterReportingService", "(Lio/elevenlabs/domain/services/CharacterReportingService;)V", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/player/PlayerService;", "getPlayerService", "()Lio/elevenlabs/domain/services/player/PlayerService;", "setPlayerService", "(Lio/elevenlabs/domain/services/player/PlayerService;)V", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "setAnalytics", "(Lio/elevenlabs/domain/Analytics;)V", "Lio/elevenlabs/domain/services/player/PlayerSeekEmitter;", "seekEmitter", "Lio/elevenlabs/domain/services/player/PlayerSeekEmitter;", "getSeekEmitter", "()Lio/elevenlabs/domain/services/player/PlayerSeekEmitter;", "setSeekEmitter", "(Lio/elevenlabs/domain/services/player/PlayerSeekEmitter;)V", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "getStringProvider", "()Lio/elevenlabs/domain/StringProvider;", "setStringProvider", "(Lio/elevenlabs/domain/StringProvider;)V", "Lio/elevenlabs/domain/services/SoundscapesService;", "soundscapesService", "Lio/elevenlabs/domain/services/SoundscapesService;", "getSoundscapesService", "()Lio/elevenlabs/domain/services/SoundscapesService;", "setSoundscapesService", "(Lio/elevenlabs/domain/services/SoundscapesService;)V", "Lio/elevenlabs/player/audio/LoopingAudioPlayer;", "loopingAudioPlayer", "Lio/elevenlabs/player/audio/LoopingAudioPlayer;", "getLoopingAudioPlayer", "()Lio/elevenlabs/player/audio/LoopingAudioPlayer;", "setLoopingAudioPlayer", "(Lio/elevenlabs/player/audio/LoopingAudioPlayer;)V", "Lio/elevenlabs/domain/services/PersistentPlayerQueueService;", "persistentPlayerQueueService", "Lio/elevenlabs/domain/services/PersistentPlayerQueueService;", "getPersistentPlayerQueueService", "()Lio/elevenlabs/domain/services/PersistentPlayerQueueService;", "setPersistentPlayerQueueService", "(Lio/elevenlabs/domain/services/PersistentPlayerQueueService;)V", "Lio/elevenlabs/domain/services/PlayerPreferencesService;", "playerPreferencesService", "Lio/elevenlabs/domain/services/PlayerPreferencesService;", "getPlayerPreferencesService", "()Lio/elevenlabs/domain/services/PlayerPreferencesService;", "setPlayerPreferencesService", "(Lio/elevenlabs/domain/services/PlayerPreferencesService;)V", "Lio/elevenlabs/player/AssistantTriggerEmitter;", "assistantTriggerEmitter", "Lio/elevenlabs/player/AssistantTriggerEmitter;", "getAssistantTriggerEmitter", "()Lio/elevenlabs/player/AssistantTriggerEmitter;", "setAssistantTriggerEmitter", "(Lio/elevenlabs/player/AssistantTriggerEmitter;)V", "Lio/elevenlabs/domain/services/VibrationService;", "vibrationService", "Lio/elevenlabs/domain/services/VibrationService;", "getVibrationService", "()Lio/elevenlabs/domain/services/VibrationService;", "setVibrationService", "(Lio/elevenlabs/domain/services/VibrationService;)V", "Lio/elevenlabs/player/AssistantSessionManager;", "assistantSessionManager", "Lio/elevenlabs/player/AssistantSessionManager;", "getAssistantSessionManager", "()Lio/elevenlabs/player/AssistantSessionManager;", "setAssistantSessionManager", "(Lio/elevenlabs/player/AssistantSessionManager;)V", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "bookmarkService", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "getBookmarkService", "()Lio/elevenlabs/domain/services/ReadBookmarkService;", "setBookmarkService", "(Lio/elevenlabs/domain/services/ReadBookmarkService;)V", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "getToastService", "()Lio/elevenlabs/domain/services/ToastService;", "setToastService", "(Lio/elevenlabs/domain/services/ToastService;)V", "Lio/elevenlabs/player/CreateBookmarkFromOffsetUseCase;", "createBookmarkFromOffsetUseCase", "Lio/elevenlabs/player/CreateBookmarkFromOffsetUseCase;", "getCreateBookmarkFromOffsetUseCase", "()Lio/elevenlabs/player/CreateBookmarkFromOffsetUseCase;", "setCreateBookmarkFromOffsetUseCase", "(Lio/elevenlabs/player/CreateBookmarkFromOffsetUseCase;)V", "Lio/elevenlabs/domain/usecase/IsAudioBookmarksAllowedUseCase;", "isAudioBookmarksAllowedUseCase", "Lio/elevenlabs/domain/usecase/IsAudioBookmarksAllowedUseCase;", "()Lio/elevenlabs/domain/usecase/IsAudioBookmarksAllowedUseCase;", "setAudioBookmarksAllowedUseCase", "(Lio/elevenlabs/domain/usecase/IsAudioBookmarksAllowedUseCase;)V", "Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase;", "triggerAssistantFromMediaButtonUseCase", "Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase;", "getTriggerAssistantFromMediaButtonUseCase", "()Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase;", "setTriggerAssistantFromMediaButtonUseCase", "(Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase;)V", "Lio/elevenlabs/player/media/MediaItemCreator;", "mediaItemCreator", "Lio/elevenlabs/player/media/MediaItemCreator;", "getMediaItemCreator", "()Lio/elevenlabs/player/media/MediaItemCreator;", "setMediaItemCreator", "(Lio/elevenlabs/player/media/MediaItemCreator;)V", "Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "consumptionTrackingService", "Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "getConsumptionTrackingService", "()Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "setConsumptionTrackingService", "(Lio/elevenlabs/domain/services/ConsumptionTrackingService;)V", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/services/ConnectivityService;", "getConnectivityService", "()Lio/elevenlabs/domain/services/ConnectivityService;", "setConnectivityService", "(Lio/elevenlabs/domain/services/ConnectivityService;)V", ParameterNames.TAG, "Ljava/lang/String;", "Lir/j1;", "Lir/j1;", "currentMediaItem", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needsInitialSeek", "Ljava/util/concurrent/atomic/AtomicBoolean;", "seekPositionReady", "pendingSeekChapterIndex", TokenNames.I, "pendingSeekPositionMs", "J", "currentReadId", "Lir/i1;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "actionsFlow", "Lir/i1;", "currentSoundscapeId", "currentSoundscapeFile", "Ljava/io/File;", "currentSoundscapeMixingLevel", TokenNames.F, "Lio/elevenlabs/player/consumption/ConsumptionCoordinator;", "consumption", "Lio/elevenlabs/player/consumption/ConsumptionCoordinator;", "Lio/elevenlabs/player/audio/SleepTimerFadeOut;", "sleepTimerFadeOut", "Lio/elevenlabs/player/audio/SleepTimerFadeOut;", "mediaSession", "Lja/z1;", "Lio/elevenlabs/player/TtsAwareForwardingPlayer;", "ttsAwarePlayer", "Lio/elevenlabs/player/TtsAwareForwardingPlayer;", "Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase$AssistantState;", "assistantState", "Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase$AssistantState;", "cachedNextAction", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "cachedPreviousAction", "cachedForwardAction", "cachedBackAction", "Companion", "AudioPositionData", "PlayerListener", "MediaSessionServiceListener", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService extends Hilt_BackgroundPlayerService {
    private static final String CHANNEL_ID = "elevenlabs_channel_id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NOTIFICATION_ID = 11;
    public Analytics analytics;
    public AssistantSessionManager assistantSessionManager;
    public AssistantTriggerEmitter assistantTriggerEmitter;
    public AuthService authService;
    public ReadBookmarkService bookmarkService;
    private BluetoothButtonAction cachedBackAction;
    private BluetoothButtonAction cachedForwardAction;
    private BluetoothButtonAction cachedNextAction;
    private BluetoothButtonAction cachedPreviousAction;
    public CharacterReportingService characterReportingService;
    public ConnectivityService connectivityService;
    private ConsumptionCoordinator consumption;
    public ConsumptionTrackingService consumptionTrackingService;
    public CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase;
    private String currentReadId;
    private File currentSoundscapeFile;
    private String currentSoundscapeId;
    public DispatcherFactory dispatcherFactory;
    public GetCurrentTimeUseCase getCurrentTimeUseCase;
    public IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase;
    public Logger logger;
    public LoopingAudioPlayer loopingAudioPlayer;
    public MediaItemCreator mediaItemCreator;
    private z1 mediaSession;
    private int pendingSeekChapterIndex;
    private long pendingSeekPositionMs;
    public PersistentPlayerQueueService persistentPlayerQueueService;
    public h1 player;
    public PlayerConfiguration playerConfiguration;
    public PlayerPreferencesService playerPreferencesService;
    public PlayerService playerService;
    public ReadsService readsService;
    private d0 scope;
    public PlayerSeekEmitter seekEmitter;
    private SleepTimerFadeOut sleepTimerFadeOut;
    public SoundscapesService soundscapesService;
    public StreamingService streamingService;
    public StringProvider stringProvider;
    public ToastService toastService;
    public TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase;
    private TtsAwareForwardingPlayer ttsAwarePlayer;
    public VibrationService vibrationService;
    private final String tag = "BackgroundPlayerService";
    private final j1 isPlaying = r.c(Boolean.FALSE);
    private final j1 playbackState = r.c(1);
    private final j1 currentMediaItem = r.c(null);
    private final AtomicBoolean needsInitialSeek = new AtomicBoolean(false);
    private final AtomicBoolean seekPositionReady = new AtomicBoolean(false);
    private final i1 actionsFlow = r.b(0, 1, null, 5);
    private float currentSoundscapeMixingLevel = 0.25f;
    private TriggerAssistantFromMediaButtonUseCase.AssistantState assistantState = new TriggerAssistantFromMediaButtonUseCase.AssistantState(false);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;", "", "audioFileNumber", "", "positionWithinChapterSeconds", "", "currentChapter", "Lio/elevenlabs/domain/model/Chapter;", "<init>", "(Ljava/lang/String;DLio/elevenlabs/domain/model/Chapter;)V", "getAudioFileNumber", "()Ljava/lang/String;", "getPositionWithinChapterSeconds", "()D", "getCurrentChapter", "()Lio/elevenlabs/domain/model/Chapter;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioPositionData {
        private final String audioFileNumber;
        private final Chapter currentChapter;
        private final double positionWithinChapterSeconds;

        public AudioPositionData(String str, double d10, Chapter chapter) {
            this.audioFileNumber = str;
            this.positionWithinChapterSeconds = d10;
            this.currentChapter = chapter;
        }

        public static /* synthetic */ AudioPositionData copy$default(AudioPositionData audioPositionData, String str, double d10, Chapter chapter, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = audioPositionData.audioFileNumber;
            }
            if ((i10 & 2) != 0) {
                d10 = audioPositionData.positionWithinChapterSeconds;
            }
            if ((i10 & 4) != 0) {
                chapter = audioPositionData.currentChapter;
            }
            return audioPositionData.copy(str, d10, chapter);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAudioFileNumber() {
            return this.audioFileNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final double getPositionWithinChapterSeconds() {
            return this.positionWithinChapterSeconds;
        }

        /* renamed from: component3, reason: from getter */
        public final Chapter getCurrentChapter() {
            return this.currentChapter;
        }

        public final AudioPositionData copy(String audioFileNumber, double positionWithinChapterSeconds, Chapter currentChapter) {
            return new AudioPositionData(audioFileNumber, positionWithinChapterSeconds, currentChapter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioPositionData)) {
                return false;
            }
            AudioPositionData audioPositionData = (AudioPositionData) other;
            if (m.c(this.audioFileNumber, audioPositionData.audioFileNumber) && Double.compare(this.positionWithinChapterSeconds, audioPositionData.positionWithinChapterSeconds) == 0 && m.c(this.currentChapter, audioPositionData.currentChapter)) {
                return true;
            }
            return false;
        }

        public final String getAudioFileNumber() {
            return this.audioFileNumber;
        }

        public final Chapter getCurrentChapter() {
            return this.currentChapter;
        }

        public final double getPositionWithinChapterSeconds() {
            return this.positionWithinChapterSeconds;
        }

        public int hashCode() {
            int hashCode;
            String str = this.audioFileNumber;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int c5 = n.c(hashCode * 31, 31, this.positionWithinChapterSeconds);
            Chapter chapter = this.currentChapter;
            if (chapter != null) {
                i10 = chapter.hashCode();
            }
            return c5 + i10;
        }

        public String toString() {
            return "AudioPositionData(audioFileNumber=" + this.audioFileNumber + ", positionWithinChapterSeconds=" + this.positionWithinChapterSeconds + ", currentChapter=" + this.currentChapter + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService$MediaSessionServiceListener;", "Lja/z2;", "<init>", "(Lio/elevenlabs/player/BackgroundPlayerService;)V", "Lsn/z;", "onForegroundServiceStartNotAllowedException", "()V", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public final class MediaSessionServiceListener implements z2 {
        public MediaSessionServiceListener() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [f9.e, java.lang.Object, y5.m] */
        @Override // ja.z2
        public void onForegroundServiceStartNotAllowedException() {
            Logger.logWarning$default(BackgroundPlayerService.this.getLogger(), BackgroundPlayerService.this.tag, "MediaSessionServiceListener.onForegroundServiceStartNotAllowedException()", null, 4, null);
            if (Build.VERSION.SDK_INT >= 33 && BackgroundPlayerService.this.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            BackgroundPlayerService backgroundPlayerService = BackgroundPlayerService.this;
            w wVar = new w(backgroundPlayerService);
            BackgroundPlayerService.this.ensureNotificationChannel(wVar);
            y5.n nVar = new y5.n(BackgroundPlayerService.this, BackgroundPlayerService.CHANNEL_ID);
            nVar.f38381v.icon = io.elevenlabs.ui.R.drawable.notification_icon;
            nVar.f38365e = y5.n.b("Playback cannot be resumed");
            ?? obj = new Object();
            obj.f38360b = y5.n.b("Press on the play button on the media notification if it is still present, otherwise please open the app to start the playback and re-connect the session to the controller");
            nVar.e(obj);
            nVar.f38370j = 0;
            nVar.c(16, true);
            PendingIntent singleTopActivity = BackgroundPlayerService.this.getSingleTopActivity(null);
            if (singleTopActivity != null) {
                nVar.f38367g = singleTopActivity;
            }
            Notification a10 = nVar.a();
            Bundle bundle = a10.extras;
            if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
                s sVar = new s(backgroundPlayerService.getPackageName(), a10);
                synchronized (w.f38399e) {
                    try {
                        if (w.f38400f == null) {
                            w.f38400f = new v(backgroundPlayerService.getApplicationContext());
                        }
                        w.f38400f.f38393b.obtainMessage(0, sVar).sendToTarget();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                wVar.f38401a.cancel(null, 11);
                return;
            }
            wVar.f38401a.notify(null, 11, a10);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService$PlayerListener;", "Lw7/f1;", "<init>", "(Lio/elevenlabs/player/BackgroundPlayerService;)V", "Lw7/r0;", "mediaItem", "", "reason", "Lsn/z;", "onMediaItemTransition", "(Lw7/r0;I)V", "", "isPlaying", "onIsPlayingChanged", "(Z)V", "Lw7/g1;", "oldPosition", "newPosition", "onPositionDiscontinuity", "(Lw7/g1;Lw7/g1;I)V", "playbackState", "onPlaybackStateChanged", "(I)V", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public final class PlayerListener implements f1 {
        public PlayerListener() {
        }

        @Override // w7.f1
        public void onIsPlayingChanged(boolean isPlaying) {
            BackgroundPlayerService.this.getLogger().log(BackgroundPlayerService.this.tag, "PlayerListener.onIsPlayingChanged - isPlaying: " + isPlaying);
            BackgroundPlayerService.this.isPlaying.tryEmit(Boolean.valueOf(isPlaying));
        }

        @Override // w7.f1
        public void onMediaItemTransition(r0 mediaItem, int reason) {
            String str;
            String str2;
            String str3;
            z1 z1Var;
            boolean isActivity;
            if (reason != 0) {
                if (reason != 1) {
                    if (reason != 2) {
                        if (reason != 3) {
                            str = com.google.android.gms.internal.play_billing.b.j(reason, "UNKNOWN(", Separators.RPAREN);
                        } else {
                            str = "PLAYLIST_CHANGED";
                        }
                    } else {
                        str = "SEEK";
                    }
                } else {
                    str = "AUTO";
                }
            } else {
                str = "REPEAT";
            }
            Logger logger = BackgroundPlayerService.this.getLogger();
            String str4 = BackgroundPlayerService.this.tag;
            if (mediaItem != null) {
                str2 = mediaItem.f36578a;
            } else {
                str2 = null;
            }
            logger.log(str4, defpackage.f.k("PlayerListener.onMediaItemTransition - mediaItem: ", str2, ", reason: ", str));
            BackgroundPlayerService backgroundPlayerService = BackgroundPlayerService.this;
            if (mediaItem != null) {
                str3 = mediaItem.f36578a;
            } else {
                str3 = null;
            }
            PendingIntent singleTopActivity = backgroundPlayerService.getSingleTopActivity(str3);
            if (singleTopActivity != null && (z1Var = BackgroundPlayerService.this.mediaSession) != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    isActivity = singleTopActivity.isActivity();
                    gg.b.p(isActivity);
                }
                z1Var.f19331a.w(singleTopActivity);
            }
            if (reason == 1) {
                r1 currentTimeline = BackgroundPlayerService.this.getPlayer().getCurrentTimeline();
                currentTimeline.getClass();
                if (!currentTimeline.p() && currentTimeline.o() > 1) {
                    d0 d0Var = BackgroundPlayerService.this.scope;
                    if (d0Var != null) {
                        g0.D(d0Var, BackgroundPlayerService.this.getDispatcherFactory().getMain(), null, new BackgroundPlayerService$PlayerListener$onMediaItemTransition$2(BackgroundPlayerService.this, null), 2);
                    } else {
                        m.i("scope");
                        throw null;
                    }
                }
            }
            if (mediaItem != null) {
                String str5 = mediaItem.f36578a;
                str5.getClass();
                if (str5.length() > 0) {
                    BackgroundPlayerService.this.currentReadId = str5;
                    BackgroundPlayerService.this.currentMediaItem.tryEmit(mediaItem);
                }
            }
            if (reason == 3 && mediaItem != null) {
                String str6 = mediaItem.f36578a;
                str6.getClass();
                if (str6.length() > 0) {
                    BackgroundPlayerService.this.prepareInitialChapterSeek(mediaItem);
                }
            }
        }

        @Override // w7.f1
        public void onPlaybackStateChanged(int playbackState) {
            String str;
            if (playbackState != 1) {
                if (playbackState != 2) {
                    if (playbackState != 3) {
                        if (playbackState != 4) {
                            str = com.google.android.gms.internal.play_billing.b.j(playbackState, "UNKNOWN(", Separators.RPAREN);
                        } else {
                            str = "ENDED";
                        }
                    } else {
                        str = "READY";
                    }
                } else {
                    str = "BUFFERING";
                }
            } else {
                str = "IDLE";
            }
            BackgroundPlayerService.this.getLogger().log(BackgroundPlayerService.this.tag, "PlayerListener.onPlaybackStateChanged - state: ".concat(str));
            if (DeferredSeekGuard.INSTANCE.shouldExecuteDeferredInitialSeek(playbackState, BackgroundPlayerService.this.seekPositionReady.get(), BackgroundPlayerService.this.needsInitialSeek.get()) && BackgroundPlayerService.this.needsInitialSeek.compareAndSet(true, false)) {
                BackgroundPlayerService.this.seekPositionReady.set(false);
                d0 d0Var = BackgroundPlayerService.this.scope;
                if (d0Var != null) {
                    g0.D(d0Var, BackgroundPlayerService.this.getDispatcherFactory().getMain(), null, new BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1(BackgroundPlayerService.this, null), 2);
                } else {
                    m.i("scope");
                    throw null;
                }
            }
            if (playbackState == 3) {
                d0 d0Var2 = BackgroundPlayerService.this.scope;
                if (d0Var2 != null) {
                    g0.D(d0Var2, BackgroundPlayerService.this.getDispatcherFactory().getMain(), null, new BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2(BackgroundPlayerService.this, null), 2);
                } else {
                    m.i("scope");
                    throw null;
                }
            }
            if (playbackState == 4) {
                d0 d0Var3 = BackgroundPlayerService.this.scope;
                if (d0Var3 != null) {
                    g0.D(d0Var3, BackgroundPlayerService.this.getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$3(BackgroundPlayerService.this, null), 2);
                } else {
                    m.i("scope");
                    throw null;
                }
            }
            BackgroundPlayerService.this.playbackState.tryEmit(Integer.valueOf(playbackState));
        }

        @Override // w7.f1
        public void onPositionDiscontinuity(g1 oldPosition, g1 newPosition, int reason) {
            boolean z6;
            oldPosition.getClass();
            newPosition.getClass();
            if (reason == 1 && BackgroundPlayerService.this.seekPositionReady.get() && BackgroundPlayerService.this.needsInitialSeek.get()) {
                long abs = Math.abs(newPosition.f36358f - oldPosition.f36358f);
                if (newPosition.f36354b != oldPosition.f36354b) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean isMeaningfulSeekDiscontinuity$default = DeferredSeekGuard.isMeaningfulSeekDiscontinuity$default(DeferredSeekGuard.INSTANCE, abs, z6, 0L, 4, null);
                BackgroundPlayerService backgroundPlayerService = BackgroundPlayerService.this;
                if (!isMeaningfulSeekDiscontinuity$default) {
                    backgroundPlayerService.getLogger().log(BackgroundPlayerService.this.tag, "Ignoring tiny seek discontinuity while initial seek pending: delta=" + abs + "ms, mediaItemChanged=" + z6);
                    return;
                }
                backgroundPlayerService.needsInitialSeek.set(false);
                BackgroundPlayerService.this.seekPositionReady.set(false);
                BackgroundPlayerService.this.getLogger().log(BackgroundPlayerService.this.tag, "Skipping deferred initial seek because a newer seek already occurred: delta=" + abs + "ms, mediaItemChanged=" + z6);
            }
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onCues(y7.c cVar) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(w7.d dVar) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(d1 d1Var) {
        }

        @Override // w7.f1
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(o oVar) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z6) {
        }

        @Override // w7.f1
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z6) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(u0 u0Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onMetadata(w0 w0Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(b1 b1Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onPlayerError(a1 a1Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(a1 a1Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(u0 u0Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z6) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z6) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(w1 w1Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onTracksChanged(y1 y1Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(f2 f2Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z6) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onEvents(h1 h1Var, e1 e1Var) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z6, int i10) {
        }

        @Override // w7.f1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z6, int i10) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        }

        @Override // w7.f1
        public /* bridge */ /* synthetic */ void onTimelineChanged(r1 r1Var, int i10) {
        }

        @Override // w7.f1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BluetoothButtonAction.values().length];
            try {
                iArr[BluetoothButtonAction.SKIP_FORWARD_15.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothButtonAction.SKIP_BACKWARD_15.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothButtonAction.SKIP_FORWARD_30.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BluetoothButtonAction.SKIP_BACKWARD_30.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BluetoothButtonAction.SKIP_FORWARD_60.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BluetoothButtonAction.SKIP_BACKWARD_60.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BluetoothButtonAction.NEXT_CHAPTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BluetoothButtonAction.PREVIOUS_CHAPTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BluetoothButtonAction.BOOKMARK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BluetoothButtonAction.PLAY_PAUSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BluetoothButtonAction.VOICE_CHAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BluetoothButtonAction.NOTHING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BackgroundPlayerService() {
        PlayerPreferences.Defaults defaults = PlayerPreferences.Defaults.INSTANCE;
        this.cachedNextAction = defaults.getNEXT_BUTTON_ACTION();
        this.cachedPreviousAction = defaults.getPREVIOUS_BUTTON_ACTION();
        this.cachedForwardAction = defaults.getFORWARD_BUTTON_ACTION();
        this.cachedBackAction = defaults.getBACK_BUTTON_ACTION();
    }

    private final i audioPositionTrackingFlow(r0 item, ReadMeta readMeta) {
        ir.w wVar = new ir.w(r.G(new ir.d1(this.isPlaying, this.playbackState, new BackgroundPlayerService$audioPositionTrackingFlow$1(null), 1), new BackgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1(null, this, readMeta)), new BackgroundPlayerService$audioPositionTrackingFlow$3(this, null), 5);
        xq.a aVar = xq.b.f38124b;
        return new ir.w(r.D(wVar, g.n(2, xq.d.SECONDS)), new BackgroundPlayerService$audioPositionTrackingFlow$4(this, item, null), 5);
    }

    public final List<ja.d> buildMediaButtons(BluetoothButtonAction forwardAction, BluetoothButtonAction backAction) {
        ArrayList arrayList = new ArrayList();
        ja.d buttonForAction = getButtonForAction(backAction, false);
        if (buttonForAction != null) {
            getLogger().log(this.tag, "Registering BACK button action: " + backAction);
            arrayList.add(buttonForAction);
        }
        ja.d buttonForAction2 = getButtonForAction(forwardAction, true);
        if (buttonForAction2 != null) {
            getLogger().log(this.tag, "Registering FORWARD button action: " + forwardAction);
            arrayList.add(buttonForAction2);
        }
        getLogger().log(this.tag, "Total media button preferences: " + arrayList.size());
        return arrayList;
    }

    public final void createBookmarkFromMediaButton() {
        getVibrationService().vibrateShort();
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$createBookmarkFromMediaButton$1(this, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    private final BackgroundPlayerService$createMediaSessionCallback$1 createMediaSessionCallback() {
        return new BackgroundPlayerService$createMediaSessionCallback$1(this);
    }

    /* renamed from: currentAudioPosition-HG0u8IE */
    public final i m999currentAudioPositionHG0u8IE(ReadMeta readMeta, long delayDuration) {
        return r.j(new BackgroundPlayerService$currentAudioPosition$1(this, readMeta, delayDuration, null));
    }

    /* renamed from: currentCharacterOffset-HG0u8IE */
    private final i m1000currentCharacterOffsetHG0u8IE(long startOffset, long delayDuration) {
        return r.j(new BackgroundPlayerService$currentCharacterOffset$1(this, delayDuration, startOffset, null));
    }

    public final void ensureNotificationChannel(w notificationManagerCompat) {
        NotificationChannel notificationChannel;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (i10 >= 26) {
                notificationChannel = y5.o.c(notificationManagerCompat.f38401a);
            } else {
                notificationManagerCompat.getClass();
                notificationChannel = null;
            }
            if (notificationChannel == null) {
                p.s();
                NotificationChannel c5 = p.c();
                if (i10 >= 26) {
                    y5.o.b(notificationManagerCompat.f38401a, c5);
                }
            }
        }
    }

    public final void executeButtonAction(BluetoothButtonAction action, String buttonType) {
        Analytics.Event playerClickedSeekBackward;
        int i10;
        Analytics.Event playerClickedSeekBackward2;
        int i11;
        Analytics.Event playerClickedSeekBackward3;
        int i12;
        getLogger().log(this.tag, "Executing button action: " + action + " for " + buttonType);
        boolean z6 = false;
        switch (WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
            case 2:
                if (action == BluetoothButtonAction.SKIP_FORWARD_15) {
                    z6 = true;
                }
                Analytics analytics = getAnalytics();
                if (z6) {
                    playerClickedSeekBackward = new Analytics.Event.PlayerClickedSeekForward(Analytics.Event.PlayerControlEventSource.MediaControls);
                } else {
                    playerClickedSeekBackward = new Analytics.Event.PlayerClickedSeekBackward(Analytics.Event.PlayerControlEventSource.MediaControls);
                }
                analytics.log(playerClickedSeekBackward);
                if (z6) {
                    i10 = 15;
                } else {
                    i10 = -15;
                }
                seekBySeconds(i10);
                return;
            case 3:
            case 4:
                if (action == BluetoothButtonAction.SKIP_FORWARD_30) {
                    z6 = true;
                }
                Analytics analytics2 = getAnalytics();
                if (z6) {
                    playerClickedSeekBackward2 = new Analytics.Event.PlayerClickedSeekForward(Analytics.Event.PlayerControlEventSource.MediaControls);
                } else {
                    playerClickedSeekBackward2 = new Analytics.Event.PlayerClickedSeekBackward(Analytics.Event.PlayerControlEventSource.MediaControls);
                }
                analytics2.log(playerClickedSeekBackward2);
                if (z6) {
                    i11 = 30;
                } else {
                    i11 = -30;
                }
                seekBySeconds(i11);
                return;
            case 5:
            case 6:
                if (action == BluetoothButtonAction.SKIP_FORWARD_60) {
                    z6 = true;
                }
                Analytics analytics3 = getAnalytics();
                if (z6) {
                    playerClickedSeekBackward3 = new Analytics.Event.PlayerClickedSeekForward(Analytics.Event.PlayerControlEventSource.MediaControls);
                } else {
                    playerClickedSeekBackward3 = new Analytics.Event.PlayerClickedSeekBackward(Analytics.Event.PlayerControlEventSource.MediaControls);
                }
                analytics3.log(playerClickedSeekBackward3);
                if (z6) {
                    i12 = 60;
                } else {
                    i12 = -60;
                }
                seekBySeconds(i12);
                return;
            case 7:
                d0 d0Var = this.scope;
                if (d0Var != null) {
                    g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$executeButtonAction$1(this, null), 2);
                    return;
                } else {
                    m.i("scope");
                    throw null;
                }
            case 8:
                d0 d0Var2 = this.scope;
                if (d0Var2 != null) {
                    g0.D(d0Var2, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$executeButtonAction$2(this, null), 2);
                    return;
                } else {
                    m.i("scope");
                    throw null;
                }
            case 9:
                getLogger().log(this.tag, "Bookmark requested via media button");
                createBookmarkFromMediaButton();
                return;
            case 10:
                getLogger().log(this.tag, "Play/pause action - delegating to Media3");
                return;
            case 11:
                getLogger().log(this.tag, "Voice chat requested");
                triggerAssistantFromMediaButton();
                return;
            case 12:
                getLogger().log(this.tag, "No action configured");
                return;
            default:
                c6.p();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0.getCurrentIndex() < (r0.getItems().size() - 1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fireEndOfFileAnalytics(String readId) {
        boolean z6;
        MediaQueueState mediaQueueState = (MediaQueueState) getPlayerService().observeQueueState().getValue();
        if (mediaQueueState != null) {
            z6 = true;
        }
        z6 = false;
        getAnalytics().log(new Analytics.Event.PlayerReachedReadEndOfFile(readId, z6));
    }

    private final ja.d getButtonForAction(BluetoothButtonAction action, boolean isForward) {
        int i10;
        String string;
        String string2;
        String string3;
        int i11;
        String str;
        String str2;
        int i12 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        int i13 = 57410;
        String str3 = BackgroundPlayerAction.SeekBack.ACTION_ID;
        switch (i12) {
            case 1:
            case 2:
                if (isForward) {
                    i10 = 1040470;
                } else {
                    i10 = 1040473;
                }
                if (isForward) {
                    str3 = BackgroundPlayerAction.SeekForward.ACTION_ID;
                }
                if (isForward) {
                    string = getStringProvider().getString(io.elevenlabs.readerapp.R.string.media3_controls_seek_forward_description);
                } else {
                    string = getStringProvider().getString(io.elevenlabs.readerapp.R.string.media3_controls_seek_back_description);
                }
                Bundle bundle = new Bundle();
                ExchangeKt.setSeekDurationSeconds(bundle, 15);
                ja.c cVar = new ja.c(i10);
                cVar.f18777f = string;
                cVar.d(new g4(bundle, str3));
                return cVar.a();
            case 3:
            case 4:
                if (isForward) {
                    i13 = 57431;
                }
                if (isForward) {
                    str3 = BackgroundPlayerAction.SeekForward.ACTION_ID;
                }
                if (isForward) {
                    string2 = getStringProvider().getString(io.elevenlabs.readerapp.R.string.media3_controls_seek_forward_description);
                } else {
                    string2 = getStringProvider().getString(io.elevenlabs.readerapp.R.string.media3_controls_seek_back_description);
                }
                Bundle bundle2 = new Bundle();
                ExchangeKt.setSeekDurationSeconds(bundle2, 30);
                ja.c cVar2 = new ja.c(i13);
                cVar2.f18777f = string2;
                cVar2.d(new g4(bundle2, str3));
                return cVar2.a();
            case 5:
            case 6:
                if (isForward) {
                    i13 = 63220;
                }
                if (isForward) {
                    str3 = BackgroundPlayerAction.SeekForward.ACTION_ID;
                }
                if (isForward) {
                    string3 = getStringProvider().getString(io.elevenlabs.readerapp.R.string.media3_controls_seek_forward_description);
                } else {
                    string3 = getStringProvider().getString(io.elevenlabs.readerapp.R.string.media3_controls_seek_back_description);
                }
                Bundle bundle3 = new Bundle();
                ExchangeKt.setSeekDurationSeconds(bundle3, 60);
                ja.c cVar3 = new ja.c(i13);
                cVar3.f18777f = string3;
                cVar3.d(new g4(bundle3, str3));
                return cVar3.a();
            case 7:
            case 8:
                if (isForward) {
                    i11 = 57412;
                } else {
                    i11 = 57413;
                }
                if (isForward) {
                    str = BackgroundPlayerAction.NextChapter.ACTION_ID;
                } else {
                    str = BackgroundPlayerAction.PreviousChapter.ACTION_ID;
                }
                if (isForward) {
                    str2 = "Next chapter";
                } else {
                    str2 = "Previous chapter";
                }
                ja.c cVar4 = new ja.c(i11);
                cVar4.f18777f = str2;
                cVar4.d(new g4(Bundle.EMPTY, str));
                return cVar4.a();
            case 9:
                ja.c cVar5 = new ja.c(1042534);
                cVar5.f18777f = "Bookmark";
                cVar5.d(new g4(Bundle.EMPTY, BackgroundPlayerAction.Bookmark.ACTION_ID));
                return cVar5.a();
            case 10:
            case 12:
                return null;
            case 11:
                ja.c cVar6 = new ja.c(58654);
                cVar6.f18777f = "Voice chat";
                cVar6.d(new g4(Bundle.EMPTY, BackgroundPlayerAction.VoiceChat.ACTION_ID));
                return cVar6.a();
            default:
                c6.p();
                return null;
        }
    }

    public final k getCurrentPlaybackSnapshot(ReadMeta readMeta) {
        String str;
        int currentWindowIndex = getCurrentWindowIndex(readMeta);
        long currentPosition = getPlayer().getCurrentPosition();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        double d10 = currentPosition / 1000.0d;
        Chapter chapter = (Chapter) tn.o.z0(currentWindowIndex, readMeta.getChapters());
        if (chapter != null) {
            str = chapter.getAudioFileNumber();
        } else {
            str = null;
        }
        return new k(str, Double.valueOf(d10));
    }

    public final int getCurrentTtsChapterIndex(ReadMeta read) {
        List<Chapter> chapters = read.getChapters();
        TtsAwareForwardingPlayer ttsAwareForwardingPlayer = this.ttsAwarePlayer;
        if (ttsAwareForwardingPlayer != null) {
            return ChapterUtilsKt.findTtsChapterIndex(chapters, ttsAwareForwardingPlayer.getCurrentCharOffset());
        }
        m.i("ttsAwarePlayer");
        throw null;
    }

    public final int getCurrentWindowIndex(ReadMeta read) {
        if (read.getChapters().size() > 1) {
            r1 currentTimeline = getPlayer().getCurrentTimeline();
            currentTimeline.getClass();
            if (!currentTimeline.p()) {
                return currentTimeline.f(getPlayer().getCurrentPeriodIndex(), new o1(), false).f36506c;
            }
        }
        return 0;
    }

    public final float getPlaybackSpeed() {
        return getPlayer().getPlaybackParameters().f36278a;
    }

    public final PendingIntent getSingleTopActivity(String readId) {
        if (readId == null) {
            z zVar = new z(this);
            zVar.b(new Intent(this, (Class<?>) m0.H(getPlayerConfiguration().getActivityClass())));
            return zVar.d();
        }
        z zVar2 = new z(this);
        zVar2.b(new Intent("android.intent.action.VIEW", Uri.parse(Companion.buildPlayerDeepLink$default(INSTANCE, readId, Analytics.Event.PlayerActivationSource.NotificationControls, false, 4, null)), this, m0.H(getPlayerConfiguration().getActivityClass())));
        return zVar2.d();
    }

    public final Object handleNextChapter(wn.c<? super sn.z> cVar) {
        Object navigateChapter = navigateChapter(1, cVar);
        if (navigateChapter == xn.a.f37986a) {
            return navigateChapter;
        }
        return sn.z.f31622a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(1:(4:12|13|(1:15)|16)(2:18|19))(10:20|21|22|23|24|(2:26|(2:28|(2:(1:38)|16)(2:35|36)))|41|(0)|(0)|16))(1:43))(4:51|(1:57)|45|(10:47|(2:49|40)|22|23|24|(0)|41|(0)|(0)|16)(7:50|24|(0)|41|(0)|(0)|16))|44|45|(0)(0)))|61|6|7|(0)(0)|44|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        if (r13 == r8) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007e, code lost:
    
        if (r13 == r8) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
    
        getLogger().log(r12.tag, defpackage.f.k("STATE_ENDED: failed to fetch readMeta for ", r1, ": ", r13.getMessage()));
        r13 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087 A[Catch: Exception -> 0x004d, TRY_ENTER, TryCatch #0 {Exception -> 0x004d, blocks: (B:21:0x0049, B:22:0x009b, B:47:0x0087), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handlePlaybackEnded(wn.c<? super sn.z> cVar) {
        BackgroundPlayerService$handlePlaybackEnded$1 backgroundPlayerService$handlePlaybackEnded$1;
        String str;
        ReadMeta readMeta;
        r0 r0Var;
        int i10;
        int currentTtsChapterIndex;
        boolean isAudioTransport;
        String str2;
        if (cVar instanceof BackgroundPlayerService$handlePlaybackEnded$1) {
            backgroundPlayerService$handlePlaybackEnded$1 = (BackgroundPlayerService$handlePlaybackEnded$1) cVar;
            int i11 = backgroundPlayerService$handlePlaybackEnded$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerService$handlePlaybackEnded$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerService$handlePlaybackEnded$1.result;
                str = backgroundPlayerService$handlePlaybackEnded$1.label;
                sn.z zVar = sn.z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (str == 0) {
                    if (str != 1) {
                        if (str != 2) {
                            if (str == 3) {
                                readMeta = (ReadMeta) backgroundPlayerService$handlePlaybackEnded$1.L$1;
                                sn.a.g(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    fireEndOfFileAnalytics(readMeta.getReadId());
                                }
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str3 = (String) backgroundPlayerService$handlePlaybackEnded$1.L$1;
                        sn.a.g(obj);
                        str = str3;
                        ReadMeta readMeta2 = (ReadMeta) obj;
                        readMeta = readMeta2;
                        r0Var = (r0) this.currentMediaItem.getValue();
                        if (r0Var != null) {
                            isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var);
                            if (isAudioTransport) {
                                i10 = 1;
                                if (readMeta == null && i10 == 0 && readMeta.getChapters().size() > 1 && (currentTtsChapterIndex = getCurrentTtsChapterIndex(readMeta)) < readMeta.getChapters().size() - 1) {
                                    int i12 = currentTtsChapterIndex + 1;
                                    Chapter chapter = readMeta.getChapters().get(i12);
                                    getLogger().log(this.tag, android.gov.nist.javax.sip.header.a.j(currentTtsChapterIndex, "TTS auto-advance: chapter ", " -> ", i12));
                                    seekToTtsOffset$default(this, false, new b(chapter, 1), 1, null);
                                    return zVar;
                                }
                                if (readMeta != null) {
                                    fr.z main = getDispatcherFactory().getMain();
                                    BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1 backgroundPlayerService$handlePlaybackEnded$isLastWindow$1 = new BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1(readMeta, this, null);
                                    backgroundPlayerService$handlePlaybackEnded$1.L$0 = null;
                                    backgroundPlayerService$handlePlaybackEnded$1.L$1 = readMeta;
                                    backgroundPlayerService$handlePlaybackEnded$1.I$0 = i10;
                                    backgroundPlayerService$handlePlaybackEnded$1.label = 3;
                                    obj = g0.Q(main, backgroundPlayerService$handlePlaybackEnded$isLastWindow$1, backgroundPlayerService$handlePlaybackEnded$1);
                                }
                                return zVar;
                            }
                        }
                        i10 = 0;
                        if (readMeta == null) {
                        }
                        if (readMeta != null) {
                        }
                        return zVar;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    r0 r0Var2 = (r0) this.currentMediaItem.getValue();
                    if ((r0Var2 == null || (r13 = r0Var2.f36578a) == null) && (r13 = this.currentReadId) == null) {
                        fr.z main2 = getDispatcherFactory().getMain();
                        BackgroundPlayerService$handlePlaybackEnded$readId$1 backgroundPlayerService$handlePlaybackEnded$readId$1 = new BackgroundPlayerService$handlePlaybackEnded$readId$1(this, null);
                        backgroundPlayerService$handlePlaybackEnded$1.label = 1;
                        obj = g0.Q(main2, backgroundPlayerService$handlePlaybackEnded$readId$1, backgroundPlayerService$handlePlaybackEnded$1);
                    }
                    str2 = r13;
                    if (str2 != null) {
                        ReadsService readsService = getReadsService();
                        backgroundPlayerService$handlePlaybackEnded$1.L$0 = null;
                        backgroundPlayerService$handlePlaybackEnded$1.L$1 = str2;
                        backgroundPlayerService$handlePlaybackEnded$1.I$0 = 0;
                        backgroundPlayerService$handlePlaybackEnded$1.label = 2;
                        obj = readsService.getRead(str2, backgroundPlayerService$handlePlaybackEnded$1);
                        str = str2;
                        if (obj == aVar) {
                            return aVar;
                        }
                        ReadMeta readMeta22 = (ReadMeta) obj;
                        readMeta = readMeta22;
                        r0Var = (r0) this.currentMediaItem.getValue();
                        if (r0Var != null) {
                        }
                        i10 = 0;
                        if (readMeta == null) {
                        }
                        if (readMeta != null) {
                        }
                        return zVar;
                    }
                    readMeta = null;
                    r0Var = (r0) this.currentMediaItem.getValue();
                    if (r0Var != null) {
                    }
                    i10 = 0;
                    if (readMeta == null) {
                    }
                    if (readMeta != null) {
                    }
                    return zVar;
                }
                String str4 = (String) obj;
                str2 = str4;
                if (str2 != null) {
                }
            }
        }
        backgroundPlayerService$handlePlaybackEnded$1 = new BackgroundPlayerService$handlePlaybackEnded$1(this, cVar);
        Object obj2 = backgroundPlayerService$handlePlaybackEnded$1.result;
        str = backgroundPlayerService$handlePlaybackEnded$1.label;
        sn.z zVar2 = sn.z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (str == 0) {
        }
        String str42 = (String) obj2;
        str2 = str42;
        if (str2 != null) {
        }
    }

    public static final long handlePlaybackEnded$lambda$1(Chapter chapter, ReadMeta readMeta) {
        readMeta.getClass();
        return chapter.getStartingCharOffset();
    }

    public final Object handlePreviousChapter(wn.c<? super sn.z> cVar) {
        Object navigateChapter = navigateChapter(-1, cVar);
        if (navigateChapter == xn.a.f37986a) {
            return navigateChapter;
        }
        return sn.z.f31622a;
    }

    private final void initializeMediaSession() {
        PlayerPreferences.Defaults defaults = PlayerPreferences.Defaults.INSTANCE;
        List<ja.d> buildMediaButtons = buildMediaButtons(defaults.getFORWARD_BUTTON_ACTION(), defaults.getBACK_BUTTON_ACTION());
        TtsAwareForwardingPlayer ttsAwareForwardingPlayer = this.ttsAwarePlayer;
        if (ttsAwareForwardingPlayer != null) {
            ja.r1 r1Var = new ja.r1(this, ttsAwareForwardingPlayer);
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            r1Var.f19178c = uuid;
            r1Var.f19185j = l0.l(buildMediaButtons);
            BackgroundPlayerService$createMediaSessionCallback$1 createMediaSessionCallback = createMediaSessionCallback();
            createMediaSessionCallback.getClass();
            r1Var.f19179d = createMediaSessionCallback;
            gg.b.y(!r1Var.f19188m);
            r1Var.f19188m = true;
            Object obj = z1.f19329b;
            int intValue = ((Integer) h2.F.get()).intValue();
            int i10 = Build.VERSION.SDK_INT;
            Context context = r1Var.f19176a;
            if (i10 < 27) {
                intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
            }
            z7.d dVar = r1Var.f19182g;
            int i11 = 4;
            if (dVar == null) {
                c8.k kVar = new c8.k(context);
                kVar.f4857b = intValue;
                kVar.f4856a = true;
                r1Var.f19182g = new l(kVar);
            } else {
                r1Var.f19182g = new y(dVar, intValue, 4);
            }
            if (i10 == 29) {
                z7.d dVar2 = r1Var.f19182g;
                AtomicReference atomicReference = ja.r1.f19175n;
                kh.a aVar = (kh.a) atomicReference.get();
                if (aVar == null) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    Point point2 = new Point();
                    defaultDisplay.getRealSize(point2);
                    int i12 = point2.y;
                    int i13 = point2.x;
                    Point point3 = new Point(i12 - (i13 - point.x), i13 - (i12 - point.y));
                    kh.a aVar2 = new kh.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                    atomicReference.set(aVar2);
                    aVar = aVar2;
                }
                r1Var.f19182g = new hq.b(dVar2, aVar, 5);
            }
            r1Var.f19182g = new hq.b(r1Var.f19182g, i11);
            this.mediaSession = new z1(r1Var.f19176a, r1Var.f19178c, r1Var.f19177b, r1Var.f19184i, r1Var.f19185j, r1Var.f19186k, r1Var.f19179d, r1Var.f19180e, r1Var.f19181f, r1Var.f19182g, r1Var.f19183h, r1Var.f19187l);
            setListener(new MediaSessionServiceListener());
            return;
        }
        m.i("ttsAwarePlayer");
        throw null;
    }

    public final boolean navigateAudioChapter(int direction) {
        boolean hasPreviousMediaItem;
        String str;
        if (direction < 0 && getPlayer().getCurrentPosition() / 1000.0d > 5.0d) {
            getPlayer().seekTo(0L);
            getLogger().log(this.tag, "Restart current audio chapter (> 5s in)");
            return true;
        }
        h1 player = getPlayer();
        if (direction > 0) {
            hasPreviousMediaItem = player.hasNextMediaItem();
        } else {
            hasPreviousMediaItem = player.hasPreviousMediaItem();
        }
        if (hasPreviousMediaItem) {
            h1 player2 = getPlayer();
            if (direction > 0) {
                player2.seekToNext();
            } else {
                player2.seekToPrevious();
            }
            Logger logger = getLogger();
            String str2 = this.tag;
            if (direction > 0) {
                str = "next";
            } else {
                str = "previous";
            }
            logger.log(str2, "Seek to " + str + " audio chapter");
            return true;
        }
        return false;
    }

    public final Object navigateChapter(int i10, wn.c<? super sn.z> cVar) {
        Object Q = g0.Q(getDispatcherFactory().getMain(), new BackgroundPlayerService$navigateChapter$2(this, i10, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return sn.z.f31622a;
    }

    private final void observeAuthState() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observeAuthState$1(this, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    private final void observeMediaItemChanges() {
        u uVar = new u(null, 3);
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observeMediaItemChanges$1(this, uVar, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    private final void observePlayerPreferences() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observePlayerPreferences$1(this, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    private final void observeQueueState() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new BackgroundPlayerService$observeQueueState$1(this, null), 3);
        } else {
            m.i("scope");
            throw null;
        }
    }

    private final void observeSleepTimer() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observeSleepTimer$1(this, null), 2);
            d0 d0Var2 = this.scope;
            if (d0Var2 != null) {
                g0.D(d0Var2, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observeSleepTimer$2(this, null), 2);
                return;
            } else {
                m.i("scope");
                throw null;
            }
        }
        m.i("scope");
        throw null;
    }

    private final void observeSoundscape() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observeSoundscape$1(this, null), 2);
            d0 d0Var2 = this.scope;
            if (d0Var2 != null) {
                g0.D(d0Var2, getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$observeSoundscape$2(this, null), 2);
                return;
            } else {
                m.i("scope");
                throw null;
            }
        }
        m.i("scope");
        throw null;
    }

    public static final boolean onCreate$lambda$1(BackgroundPlayerService backgroundPlayerService) {
        return ((Boolean) backgroundPlayerService.getConnectivityService().getIsConnected().getValue()).booleanValue();
    }

    public static final String onCreate$lambda$2(BackgroundPlayerService backgroundPlayerService) {
        u0 u0Var;
        Bundle bundle;
        String voiceId;
        r0 currentMediaItem = backgroundPlayerService.getPlayer().getCurrentMediaItem();
        if (currentMediaItem == null || (u0Var = currentMediaItem.f36581d) == null || (bundle = u0Var.J) == null || (voiceId = ExchangeKt.getVoiceId(bundle)) == null || voiceId.equals(EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
            return null;
        }
        return voiceId;
    }

    public static final sn.z onCreate$lambda$3(BackgroundPlayerService backgroundPlayerService, long j4) {
        backgroundPlayerService.seekToTtsOffset(backgroundPlayerService.getPlayer().getPlayWhenReady(), new a2.g(j4, 4));
        return sn.z.f31622a;
    }

    public static final long onCreate$lambda$3$0(long j4, ReadMeta readMeta) {
        readMeta.getClass();
        return j4;
    }

    public final void prepareInitialChapterSeek(r0 mediaItem) {
        this.seekPositionReady.set(false);
        this.needsInitialSeek.set(false);
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getMain(), null, new BackgroundPlayerService$prepareInitialChapterSeek$1(this, mediaItem, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        if (r11 == r5) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveBookmarkCharOffset(String str, ReadMeta readMeta, wn.c<? super Long> cVar) {
        BackgroundPlayerService$resolveBookmarkCharOffset$1 backgroundPlayerService$resolveBookmarkCharOffset$1;
        Object obj;
        int i10;
        xn.a aVar;
        int intValue;
        long longValue;
        Chapter chapter;
        String audioFileNumber;
        String str2;
        long j4;
        ChapterContent chapterContent;
        HighlighterPositionConverter positionConverter;
        if (cVar instanceof BackgroundPlayerService$resolveBookmarkCharOffset$1) {
            backgroundPlayerService$resolveBookmarkCharOffset$1 = (BackgroundPlayerService$resolveBookmarkCharOffset$1) cVar;
            int i11 = backgroundPlayerService$resolveBookmarkCharOffset$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerService$resolveBookmarkCharOffset$1.label = i11 - Integer.MIN_VALUE;
                obj = backgroundPlayerService$resolveBookmarkCharOffset$1.result;
                i10 = backgroundPlayerService$resolveBookmarkCharOffset$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j4 = backgroundPlayerService$resolveBookmarkCharOffset$1.J$0;
                            str2 = (String) backgroundPlayerService$resolveBookmarkCharOffset$1.L$3;
                            sn.a.g(obj);
                            chapterContent = (ChapterContent) obj;
                            if (chapterContent != null || (positionConverter = chapterContent.getPositionConverter()) == null) {
                                return null;
                            }
                            return positionConverter.toOffset(str2, j4 / 1000.0d);
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    readMeta = (ReadMeta) backgroundPlayerService$resolveBookmarkCharOffset$1.L$1;
                    str = (String) backgroundPlayerService$resolveBookmarkCharOffset$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    TtsAwareForwardingPlayer ttsAwareForwardingPlayer = this.ttsAwarePlayer;
                    if (ttsAwareForwardingPlayer != null) {
                        if (ttsAwareForwardingPlayer.getIsTts()) {
                            return new Long(getCharacterReportingService().getCurrentPosition());
                        }
                        if (readMeta == null) {
                            return null;
                        }
                        fr.z main = getDispatcherFactory().getMain();
                        BackgroundPlayerService$resolveBookmarkCharOffset$2 backgroundPlayerService$resolveBookmarkCharOffset$2 = new BackgroundPlayerService$resolveBookmarkCharOffset$2(this, null);
                        backgroundPlayerService$resolveBookmarkCharOffset$1.L$0 = str;
                        backgroundPlayerService$resolveBookmarkCharOffset$1.L$1 = readMeta;
                        backgroundPlayerService$resolveBookmarkCharOffset$1.label = 1;
                        obj = g0.Q(main, backgroundPlayerService$resolveBookmarkCharOffset$2, backgroundPlayerService$resolveBookmarkCharOffset$1);
                    } else {
                        m.i("ttsAwarePlayer");
                        throw null;
                    }
                }
                k kVar = (k) obj;
                intValue = ((Number) kVar.f31600a).intValue();
                longValue = ((Number) kVar.f31601b).longValue();
                chapter = (Chapter) tn.o.z0(intValue, readMeta.getChapters());
                if (chapter != null || (audioFileNumber = chapter.getAudioFileNumber()) == null) {
                    return null;
                }
                ReadsService readsService = getReadsService();
                backgroundPlayerService$resolveBookmarkCharOffset$1.L$0 = null;
                backgroundPlayerService$resolveBookmarkCharOffset$1.L$1 = null;
                backgroundPlayerService$resolveBookmarkCharOffset$1.L$2 = null;
                backgroundPlayerService$resolveBookmarkCharOffset$1.L$3 = audioFileNumber;
                backgroundPlayerService$resolveBookmarkCharOffset$1.I$0 = intValue;
                backgroundPlayerService$resolveBookmarkCharOffset$1.J$0 = longValue;
                backgroundPlayerService$resolveBookmarkCharOffset$1.label = 2;
                obj = readsService.loadChapterContent(str, intValue, backgroundPlayerService$resolveBookmarkCharOffset$1);
                if (obj != aVar) {
                    str2 = audioFileNumber;
                    j4 = longValue;
                    chapterContent = (ChapterContent) obj;
                    if (chapterContent != null) {
                    }
                    return null;
                }
                return aVar;
            }
        }
        backgroundPlayerService$resolveBookmarkCharOffset$1 = new BackgroundPlayerService$resolveBookmarkCharOffset$1(this, cVar);
        obj = backgroundPlayerService$resolveBookmarkCharOffset$1.result;
        i10 = backgroundPlayerService$resolveBookmarkCharOffset$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        k kVar2 = (k) obj;
        intValue = ((Number) kVar2.f31600a).intValue();
        longValue = ((Number) kVar2.f31601b).longValue();
        chapter = (Chapter) tn.o.z0(intValue, readMeta.getChapters());
        if (chapter != null) {
            return null;
        }
        ReadsService readsService2 = getReadsService();
        backgroundPlayerService$resolveBookmarkCharOffset$1.L$0 = null;
        backgroundPlayerService$resolveBookmarkCharOffset$1.L$1 = null;
        backgroundPlayerService$resolveBookmarkCharOffset$1.L$2 = null;
        backgroundPlayerService$resolveBookmarkCharOffset$1.L$3 = audioFileNumber;
        backgroundPlayerService$resolveBookmarkCharOffset$1.I$0 = intValue;
        backgroundPlayerService$resolveBookmarkCharOffset$1.J$0 = longValue;
        backgroundPlayerService$resolveBookmarkCharOffset$1.label = 2;
        obj = readsService2.loadChapterContent(str, intValue, backgroundPlayerService$resolveBookmarkCharOffset$1);
        if (obj != aVar) {
        }
        return aVar;
    }

    public final PlaybackSource resolvePlaybackSource(ReadMeta readMeta, int chapterIndex) {
        OfflineReadStatus offlineReadStatus;
        String str;
        OfflineReadData offlineReadData = readMeta.getOfflineReadData();
        if (offlineReadData != null) {
            offlineReadStatus = offlineReadData.getStatus();
        } else {
            offlineReadStatus = null;
        }
        if (offlineReadStatus != OfflineReadStatus.READY) {
            return PlaybackSource.ONLINE;
        }
        if (ReadMetaKt.isMediaType(readMeta)) {
            Chapter chapter = (Chapter) tn.o.z0(chapterIndex, readMeta.getChapters());
            if (chapter == null || (str = chapter.getAudioFileNumber()) == null) {
                str = "001";
            }
            if (offlineReadData.getCachedManifestUrls().get(str) != null) {
                return PlaybackSource.OFFLINE;
            }
            return PlaybackSource.ONLINE;
        }
        if (OfflineReadData.chapterDownloadIndicator$default(offlineReadData, chapterIndex, 0L, 2, null) instanceof ChapterOfflineDownloadStatus.Downloaded) {
            return PlaybackSource.OFFLINE;
        }
        return PlaybackSource.ONLINE;
    }

    public final Object saveSleepTimerInMediaSession(Date date, wn.c<? super sn.z> cVar) {
        getLogger().log(this.tag, "saveSleepTimerInMediaSession: " + date);
        Object Q = g0.Q(getDispatcherFactory().getMain(), new BackgroundPlayerService$saveSleepTimerInMediaSession$2(this, date, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return sn.z.f31622a;
    }

    public final void seekBySeconds(int seconds) {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new BackgroundPlayerService$seekBySeconds$1(this, seconds, null), 3);
        } else {
            m.i("scope");
            throw null;
        }
    }

    private final void seekToTtsOffset(boolean playWhenReady, ho.l getOffset) {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new BackgroundPlayerService$seekToTtsOffset$1(this, getOffset, playWhenReady, null), 3);
        } else {
            m.i("scope");
            throw null;
        }
    }

    public static /* synthetic */ void seekToTtsOffset$default(BackgroundPlayerService backgroundPlayerService, boolean z6, ho.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        backgroundPlayerService.seekToTtsOffset(z6, lVar);
    }

    public final void showBookmarkErrorToast() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getMain(), null, new BackgroundPlayerService$showBookmarkErrorToast$1(this, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    public final void showBookmarkNotSupportedToast() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getMain(), null, new BackgroundPlayerService$showBookmarkNotSupportedToast$1(this, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    public final void showBookmarkSuccessToast() {
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getMain(), null, new BackgroundPlayerService$showBookmarkSuccessToast$1(this, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackPositionForItem(r0 r0Var, i iVar, wn.c<? super i> cVar) {
        BackgroundPlayerService$trackPositionForItem$1 backgroundPlayerService$trackPositionForItem$1;
        int i10;
        int i11;
        i iVar2;
        ReadsService readsService;
        String str;
        ReadMeta readMeta;
        boolean isAudioTransport;
        Bundle bundle;
        String str2;
        Boolean bool;
        String str3;
        r0 r0Var2 = r0Var;
        if (cVar instanceof BackgroundPlayerService$trackPositionForItem$1) {
            backgroundPlayerService$trackPositionForItem$1 = (BackgroundPlayerService$trackPositionForItem$1) cVar;
            int i12 = backgroundPlayerService$trackPositionForItem$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerService$trackPositionForItem$1.label = i12 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerService$trackPositionForItem$1.result;
                i10 = backgroundPlayerService$trackPositionForItem$1.label;
                i11 = 0;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i iVar3 = (i) backgroundPlayerService$trackPositionForItem$1.L$1;
                    r0 r0Var3 = (r0) backgroundPlayerService$trackPositionForItem$1.L$0;
                    try {
                        sn.a.g(obj);
                        iVar2 = iVar3;
                        r0Var2 = r0Var3;
                    } catch (Exception e10) {
                        e = e10;
                        iVar2 = iVar3;
                        r0Var2 = r0Var3;
                        ib.i.r("Error fetching read meta: ", e.getMessage(), getLogger(), this.tag);
                        readMeta = null;
                        isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var2);
                        if (readMeta != null) {
                        }
                        Logger logger = getLogger();
                        String str4 = this.tag;
                        String str5 = r0Var2.f36578a;
                        bundle = r0Var2.f36581d.J;
                        if (bundle != null) {
                        }
                        if (readMeta != null) {
                        }
                        if (i11 != 0) {
                        }
                        StringBuilder s10 = defpackage.f.s("observeMediaItemChanges: readId=", str5, " / voiceId=", str2, " / isMediaType=");
                        s10.append(bool);
                        s10.append(" / isAudioPath=");
                        s10.append(isAudioTransport);
                        s10.append(" / tracking=");
                        s10.append(str3);
                        logger.log(str4, s10.toString());
                        if (readMeta == null) {
                        }
                    }
                } else {
                    sn.a.g(obj);
                    TtsAwareForwardingPlayer ttsAwareForwardingPlayer = this.ttsAwarePlayer;
                    if (ttsAwareForwardingPlayer != null) {
                        ttsAwareForwardingPlayer.setTts(false);
                        try {
                            readsService = getReadsService();
                            str = r0Var2.f36578a;
                            str.getClass();
                            backgroundPlayerService$trackPositionForItem$1.L$0 = r0Var2;
                            iVar2 = iVar;
                        } catch (Exception e11) {
                            e = e11;
                            iVar2 = iVar;
                            ib.i.r("Error fetching read meta: ", e.getMessage(), getLogger(), this.tag);
                            readMeta = null;
                            isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var2);
                            if (readMeta != null) {
                            }
                            Logger logger2 = getLogger();
                            String str42 = this.tag;
                            String str52 = r0Var2.f36578a;
                            bundle = r0Var2.f36581d.J;
                            if (bundle != null) {
                            }
                            if (readMeta != null) {
                            }
                            if (i11 != 0) {
                            }
                            StringBuilder s102 = defpackage.f.s("observeMediaItemChanges: readId=", str52, " / voiceId=", str2, " / isMediaType=");
                            s102.append(bool);
                            s102.append(" / isAudioPath=");
                            s102.append(isAudioTransport);
                            s102.append(" / tracking=");
                            s102.append(str3);
                            logger2.log(str42, s102.toString());
                            if (readMeta == null) {
                            }
                        }
                        try {
                            backgroundPlayerService$trackPositionForItem$1.L$1 = iVar2;
                            backgroundPlayerService$trackPositionForItem$1.label = 1;
                            obj = readsService.getRead(str, backgroundPlayerService$trackPositionForItem$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            ib.i.r("Error fetching read meta: ", e.getMessage(), getLogger(), this.tag);
                            readMeta = null;
                            isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var2);
                            if (readMeta != null) {
                            }
                            Logger logger22 = getLogger();
                            String str422 = this.tag;
                            String str522 = r0Var2.f36578a;
                            bundle = r0Var2.f36581d.J;
                            if (bundle != null) {
                            }
                            if (readMeta != null) {
                            }
                            if (i11 != 0) {
                            }
                            StringBuilder s1022 = defpackage.f.s("observeMediaItemChanges: readId=", str522, " / voiceId=", str2, " / isMediaType=");
                            s1022.append(bool);
                            s1022.append(" / isAudioPath=");
                            s1022.append(isAudioTransport);
                            s1022.append(" / tracking=");
                            s1022.append(str3);
                            logger22.log(str422, s1022.toString());
                            if (readMeta == null) {
                            }
                        }
                    } else {
                        m.i("ttsAwarePlayer");
                        throw null;
                    }
                }
                readMeta = (ReadMeta) obj;
                isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var2);
                if (readMeta != null && ReadMetaKt.isMediaType(readMeta) && isAudioTransport) {
                    i11 = 1;
                }
                Logger logger222 = getLogger();
                String str4222 = this.tag;
                String str5222 = r0Var2.f36578a;
                bundle = r0Var2.f36581d.J;
                if (bundle != null) {
                    str2 = ExchangeKt.getVoiceId(bundle);
                } else {
                    str2 = null;
                }
                if (readMeta != null) {
                    bool = Boolean.valueOf(ReadMetaKt.isMediaType(readMeta));
                } else {
                    bool = null;
                }
                if (i11 != 0) {
                    str3 = "audio";
                } else {
                    str3 = "tts";
                }
                StringBuilder s10222 = defpackage.f.s("observeMediaItemChanges: readId=", str5222, " / voiceId=", str2, " / isMediaType=");
                s10222.append(bool);
                s10222.append(" / isAudioPath=");
                s10222.append(isAudioTransport);
                s10222.append(" / tracking=");
                s10222.append(str3);
                logger222.log(str4222, s10222.toString());
                if (readMeta == null) {
                    return h.f17943a;
                }
                if (i11 != 0) {
                    return audioPositionTrackingFlow(r0Var2, readMeta);
                }
                backgroundPlayerService$trackPositionForItem$1.L$0 = null;
                backgroundPlayerService$trackPositionForItem$1.L$1 = null;
                backgroundPlayerService$trackPositionForItem$1.L$2 = null;
                backgroundPlayerService$trackPositionForItem$1.Z$0 = isAudioTransport;
                backgroundPlayerService$trackPositionForItem$1.I$0 = i11;
                backgroundPlayerService$trackPositionForItem$1.label = 2;
                Object ttsPositionTrackingFlow = ttsPositionTrackingFlow(r0Var2, readMeta, iVar2, backgroundPlayerService$trackPositionForItem$1);
                if (ttsPositionTrackingFlow == obj2) {
                    return obj2;
                }
                return ttsPositionTrackingFlow;
            }
        }
        backgroundPlayerService$trackPositionForItem$1 = new BackgroundPlayerService$trackPositionForItem$1(this, cVar);
        Object obj3 = backgroundPlayerService$trackPositionForItem$1.result;
        i10 = backgroundPlayerService$trackPositionForItem$1.label;
        i11 = 0;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        readMeta = (ReadMeta) obj3;
        isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var2);
        if (readMeta != null) {
            i11 = 1;
        }
        Logger logger2222 = getLogger();
        String str42222 = this.tag;
        String str52222 = r0Var2.f36578a;
        bundle = r0Var2.f36581d.J;
        if (bundle != null) {
        }
        if (readMeta != null) {
        }
        if (i11 != 0) {
        }
        StringBuilder s102222 = defpackage.f.s("observeMediaItemChanges: readId=", str52222, " / voiceId=", str2, " / isMediaType=");
        s102222.append(bool);
        s102222.append(" / isAudioPath=");
        s102222.append(isAudioTransport);
        s102222.append(" / tracking=");
        s102222.append(str3);
        logger2222.log(str42222, s102222.toString());
        if (readMeta == null) {
        }
    }

    public final void triggerAssistantFromMediaButton() {
        getVibrationService().vibrateShort();
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new BackgroundPlayerService$triggerAssistantFromMediaButton$1(this, null), 3);
        } else {
            m.i("scope");
            throw null;
        }
    }

    public final i ttsCharacterOffsetFlow(long initialOffset, boolean hasSubscribers, boolean isPlaying, int playbackState, i emptyOffsetFlow) {
        long n2;
        if (playbackState == 1) {
            return emptyOffsetFlow;
        }
        xq.d dVar = xq.d.SECONDS;
        if (isPlaying) {
            if (hasSubscribers) {
                xq.a aVar = xq.b.f38124b;
                n2 = g.n(50, xq.d.MILLISECONDS);
            } else {
                xq.a aVar2 = xq.b.f38124b;
                n2 = g.n(10, dVar);
            }
            return m1000currentCharacterOffsetHG0u8IE(initialOffset, n2);
        }
        xq.a aVar3 = xq.b.f38124b;
        return r.F(m1000currentCharacterOffsetHG0u8IE(initialOffset, g.n(0, dVar)), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ttsPositionTrackingFlow(r0 r0Var, ReadMeta readMeta, i iVar, wn.c<? super i> cVar) {
        BackgroundPlayerService$ttsPositionTrackingFlow$1 backgroundPlayerService$ttsPositionTrackingFlow$1;
        int i10;
        Long l4;
        r0 r0Var2;
        Long l7;
        if (cVar instanceof BackgroundPlayerService$ttsPositionTrackingFlow$1) {
            backgroundPlayerService$ttsPositionTrackingFlow$1 = (BackgroundPlayerService$ttsPositionTrackingFlow$1) cVar;
            int i11 = backgroundPlayerService$ttsPositionTrackingFlow$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerService$ttsPositionTrackingFlow$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerService$ttsPositionTrackingFlow$1.result;
                i10 = backgroundPlayerService$ttsPositionTrackingFlow$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        l7 = (Long) backgroundPlayerService$ttsPositionTrackingFlow$1.L$3;
                        iVar = (i) backgroundPlayerService$ttsPositionTrackingFlow$1.L$2;
                        r0Var2 = (r0) backgroundPlayerService$ttsPositionTrackingFlow$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    Bundle bundle = r0Var.f36581d.J;
                    if (bundle != null) {
                        l4 = ExchangeKt.getInitialOffset(bundle);
                    } else {
                        l4 = null;
                    }
                    if (l4 != null && l4.longValue() != -1) {
                        getLogger().log(this.tag, "new media item / " + l4);
                        TtsAwareForwardingPlayer ttsAwareForwardingPlayer = this.ttsAwarePlayer;
                        if (ttsAwareForwardingPlayer != null) {
                            ttsAwareForwardingPlayer.setTts(true);
                            TtsAwareForwardingPlayer ttsAwareForwardingPlayer2 = this.ttsAwarePlayer;
                            if (ttsAwareForwardingPlayer2 != null) {
                                ttsAwareForwardingPlayer2.setTotalCharCount(readMeta.getCharCount());
                                TtsAwareForwardingPlayer ttsAwareForwardingPlayer3 = this.ttsAwarePlayer;
                                if (ttsAwareForwardingPlayer3 != null) {
                                    ttsAwareForwardingPlayer3.setCurrentCharOffset(l4.longValue());
                                    ReadsService readsService = getReadsService();
                                    String str = r0Var.f36578a;
                                    str.getClass();
                                    long longValue = l4.longValue();
                                    backgroundPlayerService$ttsPositionTrackingFlow$1.L$0 = r0Var;
                                    backgroundPlayerService$ttsPositionTrackingFlow$1.L$1 = null;
                                    backgroundPlayerService$ttsPositionTrackingFlow$1.L$2 = iVar;
                                    backgroundPlayerService$ttsPositionTrackingFlow$1.L$3 = l4;
                                    backgroundPlayerService$ttsPositionTrackingFlow$1.label = 1;
                                    Object updateLastCharacterOffset = readsService.updateLastCharacterOffset(str, longValue, backgroundPlayerService$ttsPositionTrackingFlow$1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (updateLastCharacterOffset == aVar) {
                                        return aVar;
                                    }
                                    r0Var2 = r0Var;
                                    l7 = l4;
                                } else {
                                    m.i("ttsAwarePlayer");
                                    throw null;
                                }
                            } else {
                                m.i("ttsAwarePlayer");
                                throw null;
                            }
                        } else {
                            m.i("ttsAwarePlayer");
                            throw null;
                        }
                    } else {
                        return h.f17943a;
                    }
                }
                ir.a1 a1Var = new ir.a1(new ir.w(r.G(new ir.d1(new ir.d1(getCharacterReportingService().getHasActiveSubscribers(), this.isPlaying, new BackgroundPlayerService$ttsPositionTrackingFlow$2(null), 1), this.playbackState, new BackgroundPlayerService$ttsPositionTrackingFlow$3(null), 1), new BackgroundPlayerService$ttsPositionTrackingFlow$$inlined$flatMapLatest$1(null, this, l7, iVar)), new BackgroundPlayerService$ttsPositionTrackingFlow$5(this, null), 5), 0);
                xq.a aVar2 = xq.b.f38124b;
                return new ir.w(r.D(a1Var, g.n(5, xq.d.SECONDS)), new BackgroundPlayerService$ttsPositionTrackingFlow$6(this, r0Var2, null), 5);
            }
        }
        backgroundPlayerService$ttsPositionTrackingFlow$1 = new BackgroundPlayerService$ttsPositionTrackingFlow$1(this, cVar);
        Object obj2 = backgroundPlayerService$ttsPositionTrackingFlow$1.result;
        i10 = backgroundPlayerService$ttsPositionTrackingFlow$1.label;
        if (i10 == 0) {
        }
        ir.a1 a1Var2 = new ir.a1(new ir.w(r.G(new ir.d1(new ir.d1(getCharacterReportingService().getHasActiveSubscribers(), this.isPlaying, new BackgroundPlayerService$ttsPositionTrackingFlow$2(null), 1), this.playbackState, new BackgroundPlayerService$ttsPositionTrackingFlow$3(null), 1), new BackgroundPlayerService$ttsPositionTrackingFlow$$inlined$flatMapLatest$1(null, this, l7, iVar)), new BackgroundPlayerService$ttsPositionTrackingFlow$5(this, null), 5), 0);
        xq.a aVar22 = xq.b.f38124b;
        return new ir.w(r.D(a1Var2, g.n(5, xq.d.SECONDS)), new BackgroundPlayerService$ttsPositionTrackingFlow$6(this, r0Var2, null), 5);
    }

    public final void updateSoundscapeSessionExtras(String id2, File file, Float mixingLevel) {
        ib.i.r("updateSoundscapeSessionExtras: id=", id2, getLogger(), this.tag);
        d0 d0Var = this.scope;
        if (d0Var != null) {
            g0.D(d0Var, getDispatcherFactory().getMain(), null, new BackgroundPlayerService$updateSoundscapeSessionExtras$1(this, id2, file, mixingLevel, null), 2);
        } else {
            m.i("scope");
            throw null;
        }
    }

    public final Analytics getAnalytics() {
        Analytics analytics = this.analytics;
        if (analytics != null) {
            return analytics;
        }
        m.i("analytics");
        throw null;
    }

    public final AssistantSessionManager getAssistantSessionManager() {
        AssistantSessionManager assistantSessionManager = this.assistantSessionManager;
        if (assistantSessionManager != null) {
            return assistantSessionManager;
        }
        m.i("assistantSessionManager");
        throw null;
    }

    public final AssistantTriggerEmitter getAssistantTriggerEmitter() {
        AssistantTriggerEmitter assistantTriggerEmitter = this.assistantTriggerEmitter;
        if (assistantTriggerEmitter != null) {
            return assistantTriggerEmitter;
        }
        m.i("assistantTriggerEmitter");
        throw null;
    }

    public final AuthService getAuthService() {
        AuthService authService = this.authService;
        if (authService != null) {
            return authService;
        }
        m.i("authService");
        throw null;
    }

    public final ReadBookmarkService getBookmarkService() {
        ReadBookmarkService readBookmarkService = this.bookmarkService;
        if (readBookmarkService != null) {
            return readBookmarkService;
        }
        m.i("bookmarkService");
        throw null;
    }

    public final CharacterReportingService getCharacterReportingService() {
        CharacterReportingService characterReportingService = this.characterReportingService;
        if (characterReportingService != null) {
            return characterReportingService;
        }
        m.i("characterReportingService");
        throw null;
    }

    public final ConnectivityService getConnectivityService() {
        ConnectivityService connectivityService = this.connectivityService;
        if (connectivityService != null) {
            return connectivityService;
        }
        m.i("connectivityService");
        throw null;
    }

    public final ConsumptionTrackingService getConsumptionTrackingService() {
        ConsumptionTrackingService consumptionTrackingService = this.consumptionTrackingService;
        if (consumptionTrackingService != null) {
            return consumptionTrackingService;
        }
        m.i("consumptionTrackingService");
        throw null;
    }

    public final CreateBookmarkFromOffsetUseCase getCreateBookmarkFromOffsetUseCase() {
        CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase = this.createBookmarkFromOffsetUseCase;
        if (createBookmarkFromOffsetUseCase != null) {
            return createBookmarkFromOffsetUseCase;
        }
        m.i("createBookmarkFromOffsetUseCase");
        throw null;
    }

    public final DispatcherFactory getDispatcherFactory() {
        DispatcherFactory dispatcherFactory = this.dispatcherFactory;
        if (dispatcherFactory != null) {
            return dispatcherFactory;
        }
        m.i("dispatcherFactory");
        throw null;
    }

    public final GetCurrentTimeUseCase getGetCurrentTimeUseCase() {
        GetCurrentTimeUseCase getCurrentTimeUseCase = this.getCurrentTimeUseCase;
        if (getCurrentTimeUseCase != null) {
            return getCurrentTimeUseCase;
        }
        m.i("getCurrentTimeUseCase");
        throw null;
    }

    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        m.i("logger");
        throw null;
    }

    public final LoopingAudioPlayer getLoopingAudioPlayer() {
        LoopingAudioPlayer loopingAudioPlayer = this.loopingAudioPlayer;
        if (loopingAudioPlayer != null) {
            return loopingAudioPlayer;
        }
        m.i("loopingAudioPlayer");
        throw null;
    }

    public final MediaItemCreator getMediaItemCreator() {
        MediaItemCreator mediaItemCreator = this.mediaItemCreator;
        if (mediaItemCreator != null) {
            return mediaItemCreator;
        }
        m.i("mediaItemCreator");
        throw null;
    }

    public final PersistentPlayerQueueService getPersistentPlayerQueueService() {
        PersistentPlayerQueueService persistentPlayerQueueService = this.persistentPlayerQueueService;
        if (persistentPlayerQueueService != null) {
            return persistentPlayerQueueService;
        }
        m.i("persistentPlayerQueueService");
        throw null;
    }

    public final h1 getPlayer() {
        h1 h1Var = this.player;
        if (h1Var != null) {
            return h1Var;
        }
        m.i("player");
        throw null;
    }

    public final PlayerConfiguration getPlayerConfiguration() {
        PlayerConfiguration playerConfiguration = this.playerConfiguration;
        if (playerConfiguration != null) {
            return playerConfiguration;
        }
        m.i("playerConfiguration");
        throw null;
    }

    public final PlayerPreferencesService getPlayerPreferencesService() {
        PlayerPreferencesService playerPreferencesService = this.playerPreferencesService;
        if (playerPreferencesService != null) {
            return playerPreferencesService;
        }
        m.i("playerPreferencesService");
        throw null;
    }

    public final PlayerService getPlayerService() {
        PlayerService playerService = this.playerService;
        if (playerService != null) {
            return playerService;
        }
        m.i("playerService");
        throw null;
    }

    public final ReadsService getReadsService() {
        ReadsService readsService = this.readsService;
        if (readsService != null) {
            return readsService;
        }
        m.i("readsService");
        throw null;
    }

    public final PlayerSeekEmitter getSeekEmitter() {
        PlayerSeekEmitter playerSeekEmitter = this.seekEmitter;
        if (playerSeekEmitter != null) {
            return playerSeekEmitter;
        }
        m.i("seekEmitter");
        throw null;
    }

    public final SoundscapesService getSoundscapesService() {
        SoundscapesService soundscapesService = this.soundscapesService;
        if (soundscapesService != null) {
            return soundscapesService;
        }
        m.i("soundscapesService");
        throw null;
    }

    public final StreamingService getStreamingService() {
        StreamingService streamingService = this.streamingService;
        if (streamingService != null) {
            return streamingService;
        }
        m.i("streamingService");
        throw null;
    }

    public final StringProvider getStringProvider() {
        StringProvider stringProvider = this.stringProvider;
        if (stringProvider != null) {
            return stringProvider;
        }
        m.i("stringProvider");
        throw null;
    }

    public final ToastService getToastService() {
        ToastService toastService = this.toastService;
        if (toastService != null) {
            return toastService;
        }
        m.i("toastService");
        throw null;
    }

    public final TriggerAssistantFromMediaButtonUseCase getTriggerAssistantFromMediaButtonUseCase() {
        TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase = this.triggerAssistantFromMediaButtonUseCase;
        if (triggerAssistantFromMediaButtonUseCase != null) {
            return triggerAssistantFromMediaButtonUseCase;
        }
        m.i("triggerAssistantFromMediaButtonUseCase");
        throw null;
    }

    public final VibrationService getVibrationService() {
        VibrationService vibrationService = this.vibrationService;
        if (vibrationService != null) {
            return vibrationService;
        }
        m.i("vibrationService");
        throw null;
    }

    public final IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase() {
        IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase = this.isAudioBookmarksAllowedUseCase;
        if (isAudioBookmarksAllowedUseCase != null) {
            return isAudioBookmarksAllowedUseCase;
        }
        m.i("isAudioBookmarksAllowedUseCase");
        throw null;
    }

    @Override // io.elevenlabs.player.Hilt_BackgroundPlayerService, ja.b3, androidx.lifecycle.e0, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.scope = g0.c(n0.l.J(g0.f(), getDispatcherFactory().getDefault()));
        this.sleepTimerFadeOut = new SleepTimerFadeOut(getLogger());
        ConsumptionTrackingService consumptionTrackingService = getConsumptionTrackingService();
        Logger logger = getLogger();
        d0 d0Var = this.scope;
        if (d0Var != null) {
            this.consumption = new ConsumptionCoordinator(consumptionTrackingService, logger, d0Var, new BackgroundPlayerService$onCreate$1(this, null));
            getPlayer().addListener(new PlayerListener());
            h1 player = getPlayer();
            h1 player2 = getPlayer();
            ConsumptionCoordinator consumptionCoordinator = this.consumption;
            if (consumptionCoordinator != null) {
                d0 d0Var2 = this.scope;
                if (d0Var2 != null) {
                    final int i10 = 0;
                    ho.a aVar = new ho.a(this) { // from class: io.elevenlabs.player.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BackgroundPlayerService f14324b;

                        {
                            this.f14324b = this;
                        }

                        @Override // ho.a
                        public final Object invoke() {
                            String str;
                            boolean onCreate$lambda$1;
                            String onCreate$lambda$2;
                            switch (i10) {
                                case 0:
                                    str = this.f14324b.currentReadId;
                                    return str;
                                case 1:
                                    onCreate$lambda$1 = BackgroundPlayerService.onCreate$lambda$1(this.f14324b);
                                    return Boolean.valueOf(onCreate$lambda$1);
                                default:
                                    onCreate$lambda$2 = BackgroundPlayerService.onCreate$lambda$2(this.f14324b);
                                    return onCreate$lambda$2;
                            }
                        }
                    };
                    BackgroundPlayerService$onCreate$3 backgroundPlayerService$onCreate$3 = new BackgroundPlayerService$onCreate$3(this, null);
                    BackgroundPlayerService$onCreate$4 backgroundPlayerService$onCreate$4 = new BackgroundPlayerService$onCreate$4(this);
                    final int i11 = 1;
                    ho.a aVar2 = new ho.a(this) { // from class: io.elevenlabs.player.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BackgroundPlayerService f14324b;

                        {
                            this.f14324b = this;
                        }

                        @Override // ho.a
                        public final Object invoke() {
                            String str;
                            boolean onCreate$lambda$1;
                            String onCreate$lambda$2;
                            switch (i11) {
                                case 0:
                                    str = this.f14324b.currentReadId;
                                    return str;
                                case 1:
                                    onCreate$lambda$1 = BackgroundPlayerService.onCreate$lambda$1(this.f14324b);
                                    return Boolean.valueOf(onCreate$lambda$1);
                                default:
                                    onCreate$lambda$2 = BackgroundPlayerService.onCreate$lambda$2(this.f14324b);
                                    return onCreate$lambda$2;
                            }
                        }
                    };
                    final int i12 = 2;
                    player.addListener(new ConsumptionPlayerListener(player2, consumptionCoordinator, d0Var2, aVar, backgroundPlayerService$onCreate$3, backgroundPlayerService$onCreate$4, aVar2, new ho.a(this) { // from class: io.elevenlabs.player.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BackgroundPlayerService f14324b;

                        {
                            this.f14324b = this;
                        }

                        @Override // ho.a
                        public final Object invoke() {
                            String str;
                            boolean onCreate$lambda$1;
                            String onCreate$lambda$2;
                            switch (i12) {
                                case 0:
                                    str = this.f14324b.currentReadId;
                                    return str;
                                case 1:
                                    onCreate$lambda$1 = BackgroundPlayerService.onCreate$lambda$1(this.f14324b);
                                    return Boolean.valueOf(onCreate$lambda$1);
                                default:
                                    onCreate$lambda$2 = BackgroundPlayerService.onCreate$lambda$2(this.f14324b);
                                    return onCreate$lambda$2;
                            }
                        }
                    }));
                    this.ttsAwarePlayer = new TtsAwareForwardingPlayer(getPlayer(), new e(this, 1));
                    initializeMediaSession();
                    observePlayerPreferences();
                    observeAuthState();
                    observeSleepTimer();
                    observeSoundscape();
                    observeQueueState();
                    observeMediaItemChanges();
                    return;
                }
                m.i("scope");
                throw null;
            }
            m.i("consumption");
            throw null;
        }
        m.i("scope");
        throw null;
    }

    @Override // ja.b3, androidx.lifecycle.e0, android.app.Service
    public void onDestroy() {
        h1 a10;
        z1 z1Var;
        boolean isActivity;
        getLogger().log(this.tag, "BackgroundPlayerService.onDestroy()");
        g0.I(wn.i.f37087a, new BackgroundPlayerService$onDestroy$1(this, null));
        ConsumptionCoordinator consumptionCoordinator = this.consumption;
        if (consumptionCoordinator != null) {
            consumptionCoordinator.reset();
            SleepTimerFadeOut sleepTimerFadeOut = this.sleepTimerFadeOut;
            if (sleepTimerFadeOut != null) {
                sleepTimerFadeOut.cancel();
                d0 d0Var = this.scope;
                if (d0Var != null) {
                    g0.i(d0Var, null);
                    PendingIntent singleTopActivity = getSingleTopActivity(null);
                    if (singleTopActivity != null && (z1Var = this.mediaSession) != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            isActivity = singleTopActivity.isActivity();
                            gg.b.p(isActivity);
                        }
                        z1Var.f19331a.w(singleTopActivity);
                    }
                    z1 z1Var2 = this.mediaSession;
                    if (z1Var2 != null) {
                        try {
                            synchronized (z1.f19329b) {
                                z1.f19330c.remove(z1Var2.f19331a.f18912i);
                            }
                            z1Var2.f19331a.t();
                        } catch (Exception unused) {
                        }
                    }
                    z1 z1Var3 = this.mediaSession;
                    if (z1Var3 != null && (a10 = z1Var3.a()) != null) {
                        a10.release();
                    }
                    clearListener();
                    super.onDestroy();
                    return;
                }
                m.i("scope");
                throw null;
            }
            m.i("sleepTimerFadeOut");
            throw null;
        }
        m.i("consumption");
        throw null;
    }

    @Override // ja.b3
    public z1 onGetSession(ja.w1 controllerInfo) {
        boolean z6;
        String str;
        controllerInfo.getClass();
        Logger logger = getLogger();
        String str2 = this.tag;
        String a10 = controllerInfo.a();
        z1 z1Var = this.mediaSession;
        if (z1Var != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z1Var != null) {
            str = z1Var.f19331a.f18912i;
        } else {
            str = null;
        }
        logger.log(str2, "BackgroundPlayerService.onGetSession() - controller: " + a10 + ", mediaSession exists: " + z6 + ", sessionId: " + str);
        z1 z1Var2 = this.mediaSession;
        z1Var2.getClass();
        return z1Var2;
    }

    @Override // ja.b3, android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        Boolean bool;
        h1 a10;
        h1 a11;
        h1 a12;
        Logger logger = getLogger();
        String str = this.tag;
        z1 z1Var = this.mediaSession;
        Integer num = null;
        if (z1Var != null && (a12 = z1Var.a()) != null) {
            bool = Boolean.valueOf(a12.getPlayWhenReady());
        } else {
            bool = null;
        }
        z1 z1Var2 = this.mediaSession;
        if (z1Var2 != null && (a11 = z1Var2.a()) != null) {
            num = Integer.valueOf(a11.getMediaItemCount());
        }
        logger.log(str, "BackgroundPlayerService.onTaskRemoved() - playWhenReady: " + bool + ", mediaItemCount: " + num);
        z1 z1Var3 = this.mediaSession;
        if (z1Var3 != null && (a10 = z1Var3.a()) != null) {
            if (a10.getPlayWhenReady() && a10.getMediaItemCount() != 0) {
                getLogger().log(this.tag, "Keeping service alive after task removal");
            } else {
                getLogger().log(this.tag, "Stopping service due to task removal");
                stopSelf();
            }
        }
    }

    public final void setAnalytics(Analytics analytics) {
        analytics.getClass();
        this.analytics = analytics;
    }

    public final void setAssistantSessionManager(AssistantSessionManager assistantSessionManager) {
        assistantSessionManager.getClass();
        this.assistantSessionManager = assistantSessionManager;
    }

    public final void setAssistantTriggerEmitter(AssistantTriggerEmitter assistantTriggerEmitter) {
        assistantTriggerEmitter.getClass();
        this.assistantTriggerEmitter = assistantTriggerEmitter;
    }

    public final void setAudioBookmarksAllowedUseCase(IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase) {
        isAudioBookmarksAllowedUseCase.getClass();
        this.isAudioBookmarksAllowedUseCase = isAudioBookmarksAllowedUseCase;
    }

    public final void setAuthService(AuthService authService) {
        authService.getClass();
        this.authService = authService;
    }

    public final void setBookmarkService(ReadBookmarkService readBookmarkService) {
        readBookmarkService.getClass();
        this.bookmarkService = readBookmarkService;
    }

    public final void setCharacterReportingService(CharacterReportingService characterReportingService) {
        characterReportingService.getClass();
        this.characterReportingService = characterReportingService;
    }

    public final void setConnectivityService(ConnectivityService connectivityService) {
        connectivityService.getClass();
        this.connectivityService = connectivityService;
    }

    public final void setConsumptionTrackingService(ConsumptionTrackingService consumptionTrackingService) {
        consumptionTrackingService.getClass();
        this.consumptionTrackingService = consumptionTrackingService;
    }

    public final void setCreateBookmarkFromOffsetUseCase(CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase) {
        createBookmarkFromOffsetUseCase.getClass();
        this.createBookmarkFromOffsetUseCase = createBookmarkFromOffsetUseCase;
    }

    public final void setDispatcherFactory(DispatcherFactory dispatcherFactory) {
        dispatcherFactory.getClass();
        this.dispatcherFactory = dispatcherFactory;
    }

    public final void setGetCurrentTimeUseCase(GetCurrentTimeUseCase getCurrentTimeUseCase) {
        getCurrentTimeUseCase.getClass();
        this.getCurrentTimeUseCase = getCurrentTimeUseCase;
    }

    public final void setLogger(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public final void setLoopingAudioPlayer(LoopingAudioPlayer loopingAudioPlayer) {
        loopingAudioPlayer.getClass();
        this.loopingAudioPlayer = loopingAudioPlayer;
    }

    public final void setMediaItemCreator(MediaItemCreator mediaItemCreator) {
        mediaItemCreator.getClass();
        this.mediaItemCreator = mediaItemCreator;
    }

    public final void setPersistentPlayerQueueService(PersistentPlayerQueueService persistentPlayerQueueService) {
        persistentPlayerQueueService.getClass();
        this.persistentPlayerQueueService = persistentPlayerQueueService;
    }

    public final void setPlayer(h1 h1Var) {
        h1Var.getClass();
        this.player = h1Var;
    }

    public final void setPlayerConfiguration(PlayerConfiguration playerConfiguration) {
        playerConfiguration.getClass();
        this.playerConfiguration = playerConfiguration;
    }

    public final void setPlayerPreferencesService(PlayerPreferencesService playerPreferencesService) {
        playerPreferencesService.getClass();
        this.playerPreferencesService = playerPreferencesService;
    }

    public final void setPlayerService(PlayerService playerService) {
        playerService.getClass();
        this.playerService = playerService;
    }

    public final void setReadsService(ReadsService readsService) {
        readsService.getClass();
        this.readsService = readsService;
    }

    public final void setSeekEmitter(PlayerSeekEmitter playerSeekEmitter) {
        playerSeekEmitter.getClass();
        this.seekEmitter = playerSeekEmitter;
    }

    public final void setSoundscapesService(SoundscapesService soundscapesService) {
        soundscapesService.getClass();
        this.soundscapesService = soundscapesService;
    }

    public final void setStreamingService(StreamingService streamingService) {
        streamingService.getClass();
        this.streamingService = streamingService;
    }

    public final void setStringProvider(StringProvider stringProvider) {
        stringProvider.getClass();
        this.stringProvider = stringProvider;
    }

    public final void setToastService(ToastService toastService) {
        toastService.getClass();
        this.toastService = toastService;
    }

    public final void setTriggerAssistantFromMediaButtonUseCase(TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase) {
        triggerAssistantFromMediaButtonUseCase.getClass();
        this.triggerAssistantFromMediaButtonUseCase = triggerAssistantFromMediaButtonUseCase;
    }

    public final void setVibrationService(VibrationService vibrationService) {
        vibrationService.getClass();
        this.vibrationService = vibrationService;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService$Companion;", "", "<init>", "()V", "NOTIFICATION_ID", "", "CHANNEL_ID", "", "buildPlayerDeepLink", "readId", "activationSource", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "showAssistant", "", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final String buildPlayerDeepLink(String readId, Analytics.Event.PlayerActivationSource activationSource, boolean showAssistant) {
            StringBuilder sb = new StringBuilder();
            sb.append("elevenlabs://authorized/player/" + readId + "?activationSource=" + activationSource.getValue());
            if (showAssistant) {
                sb.append("&showAssistant=true");
            }
            return sb.toString();
        }

        public static /* synthetic */ String buildPlayerDeepLink$default(Companion companion, String str, Analytics.Event.PlayerActivationSource playerActivationSource, boolean z6, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z6 = false;
            }
            return companion.buildPlayerDeepLink(str, playerActivationSource, z6);
        }

        private Companion() {
        }
    }
}
