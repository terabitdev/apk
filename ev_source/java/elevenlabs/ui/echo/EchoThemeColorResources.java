package io.elevenlabs.ui.echo;

import io.elevenlabs.ui.R;
import jo.a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0089\u0002\b\u0007\u0018\u0000 \u008c\u00022\u00020\u0001:\u0002\u008c\u0002B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0011\u0010%\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0011\u0010+\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0011\u0010-\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0011\u0010/\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0011\u00101\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0011\u00103\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u0011\u00105\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b4\u0010\u0006R\u0011\u00107\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b6\u0010\u0006R\u0011\u00109\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0011\u0010;\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b:\u0010\u0006R\u0011\u0010=\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b<\u0010\u0006R\u0011\u0010?\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b>\u0010\u0006R\u0011\u0010A\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0011\u0010C\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0011\u0010E\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bD\u0010\u0006R\u0011\u0010G\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bF\u0010\u0006R\u0011\u0010I\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0011\u0010K\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bJ\u0010\u0006R\u0011\u0010M\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bL\u0010\u0006R\u0011\u0010O\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bN\u0010\u0006R\u0011\u0010Q\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bP\u0010\u0006R\u0011\u0010S\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bR\u0010\u0006R\u0011\u0010U\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bT\u0010\u0006R\u0011\u0010W\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u0011\u0010Y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bX\u0010\u0006R\u0011\u0010[\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006R\u0011\u0010]\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u0011\u0010_\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b^\u0010\u0006R\u0011\u0010a\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u0011\u0010c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bb\u0010\u0006R\u0011\u0010e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bd\u0010\u0006R\u0011\u0010g\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bf\u0010\u0006R\u0011\u0010i\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bh\u0010\u0006R\u0011\u0010k\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bj\u0010\u0006R\u0011\u0010m\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bl\u0010\u0006R\u0011\u0010o\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bn\u0010\u0006R\u0011\u0010q\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bp\u0010\u0006R\u0011\u0010s\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\br\u0010\u0006R\u0011\u0010u\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bt\u0010\u0006R\u0011\u0010w\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bv\u0010\u0006R\u0011\u0010y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bx\u0010\u0006R\u0011\u0010{\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bz\u0010\u0006R\u0011\u0010}\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b|\u0010\u0006R\u0011\u0010\u007f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b~\u0010\u0006R\u0013\u0010\u0081\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0006R\u0013\u0010\u0083\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0006R\u0013\u0010\u0085\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0006R\u0013\u0010\u0087\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0006R\u0013\u0010\u0089\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0006R\u0013\u0010\u008b\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0006R\u0013\u0010\u008d\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0006R\u0013\u0010\u008f\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0006R\u0013\u0010\u0091\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u0006R\u0013\u0010\u0093\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u0006R\u0013\u0010\u0095\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u0006R\u0013\u0010\u0097\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u0006R\u0013\u0010\u0099\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u0006R\u0013\u0010\u009b\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u0006R\u0013\u0010\u009d\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u0006R\u0013\u0010\u009f\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0006R\u0013\u0010¡\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0006R\u0013\u0010£\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\u0006R\u0013\u0010¥\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0006R\u0013\u0010§\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\u0006R\u0013\u0010©\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0006R\u0013\u0010«\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0006R\u0013\u0010\u00ad\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0006R\u0013\u0010¯\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0006R\u0013\u0010±\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\u0006R\u0013\u0010³\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\u0006R\u0013\u0010µ\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0006R\u0013\u0010·\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\u0006R\u0013\u0010¹\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0006R\u0013\u0010»\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u0006R\u0013\u0010½\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u0006R\u0013\u0010¿\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u0006R\u0013\u0010Á\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\u0006R\u0013\u0010Ã\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\u0006R\u0013\u0010Å\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\u0006R\u0013\u0010Ç\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u0006R\u0013\u0010É\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\u0006R\u0013\u0010Ë\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\u0006R\u0013\u0010Í\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\u0006R\u0013\u0010Ï\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\u0006R\u0013\u0010Ñ\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u0006R\u0013\u0010Ó\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u0006R\u0013\u0010Õ\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u0006R\u0013\u0010×\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\u0006R\u0013\u0010Ù\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0006R\u0013\u0010Û\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\u0006R\u0013\u0010Ý\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u0006R\u0013\u0010ß\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bÞ\u0001\u0010\u0006R\u0013\u0010á\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bà\u0001\u0010\u0006R\u0013\u0010ã\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010\u0006R\u0013\u0010å\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\u0006R\u0013\u0010ç\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010\u0006R\u0013\u0010é\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bè\u0001\u0010\u0006R\u0013\u0010ë\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bê\u0001\u0010\u0006R\u0013\u0010í\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\u0006R\u0013\u0010ï\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bî\u0001\u0010\u0006R\u0013\u0010ñ\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bð\u0001\u0010\u0006R\u0013\u0010ó\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bò\u0001\u0010\u0006R\u0013\u0010õ\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bô\u0001\u0010\u0006R\u0013\u0010÷\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bö\u0001\u0010\u0006R\u0013\u0010ù\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bø\u0001\u0010\u0006R\u0013\u0010û\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bú\u0001\u0010\u0006R\u0013\u0010ý\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bü\u0001\u0010\u0006R\u0013\u0010ÿ\u0001\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010\u0006R\u0013\u0010\u0081\u0002\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010\u0006R\u0013\u0010\u0083\u0002\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010\u0006R\u0013\u0010\u0085\u0002\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010\u0006R\u0013\u0010\u0087\u0002\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0086\u0002\u0010\u0006R\u0013\u0010\u0089\u0002\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u0088\u0002\u0010\u0006R\u0013\u0010\u008b\u0002\u001a\u00020\u00048G¢\u0006\u0007\u001a\u0005\b\u008a\u0002\u0010\u0006¨\u0006\u008d\u0002"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColorResources;", "", "<init>", "()V", "Lp3/x;", "getSolidGray100", "(Lu2/m;I)J", "solidGray100", "getSolidGray200", "solidGray200", "getSolidGray300", "solidGray300", "getSolidGray400", "solidGray400", "getSolidGray500", "solidGray500", "getSolidGray600", "solidGray600", "getSolidGray700", "solidGray700", "getSolidGray800", "solidGray800", "getSolidGray900", "solidGray900", "getSolidGray1000", "solidGray1000", "getSolidGray1100", "solidGray1100", "getSolidGray1200", "solidGray1200", "getAlphaGray100", "alphaGray100", "getAlphaGray200", "alphaGray200", "getAlphaGray300", "alphaGray300", "getAlphaGray400", "alphaGray400", "getAlphaGray500", "alphaGray500", "getAlphaGray600", "alphaGray600", "getAlphaGray700", "alphaGray700", "getAlphaGray800", "alphaGray800", "getAlphaGray900", "alphaGray900", "getAlphaGray1000", "alphaGray1000", "getAlphaGray1100", "alphaGray1100", "getAlphaGray1200", "alphaGray1200", "getSolidRed100", "solidRed100", "getSolidRed200", "solidRed200", "getSolidRed300", "solidRed300", "getSolidRed400", "solidRed400", "getSolidRed500", "solidRed500", "getSolidRed600", "solidRed600", "getSolidRed700", "solidRed700", "getSolidRed800", "solidRed800", "getSolidRed900", "solidRed900", "getSolidRed1000", "solidRed1000", "getSolidRed1100", "solidRed1100", "getSolidRed1200", "solidRed1200", "getSolidBlue100", "solidBlue100", "getSolidBlue200", "solidBlue200", "getSolidBlue300", "solidBlue300", "getSolidBlue400", "solidBlue400", "getSolidBlue500", "solidBlue500", "getSolidBlue600", "solidBlue600", "getSolidBlue700", "solidBlue700", "getSolidBlue800", "solidBlue800", "getSolidBlue900", "solidBlue900", "getSolidBlue1000", "solidBlue1000", "getSolidBlue1100", "solidBlue1100", "getSolidBlue1200", "solidBlue1200", "getSolidAmber100", "solidAmber100", "getSolidAmber200", "solidAmber200", "getSolidAmber300", "solidAmber300", "getSolidAmber400", "solidAmber400", "getSolidAmber500", "solidAmber500", "getSolidAmber600", "solidAmber600", "getSolidAmber700", "solidAmber700", "getSolidAmber800", "solidAmber800", "getSolidAmber900", "solidAmber900", "getSolidAmber1000", "solidAmber1000", "getSolidAmber1100", "solidAmber1100", "getSolidAmber1200", "solidAmber1200", "getSolidIris100", "solidIris100", "getSolidIris200", "solidIris200", "getSolidIris300", "solidIris300", "getSolidIris400", "solidIris400", "getSolidIris500", "solidIris500", "getSolidIris600", "solidIris600", "getSolidIris700", "solidIris700", "getSolidIris800", "solidIris800", "getSolidIris900", "solidIris900", "getSolidIris1000", "solidIris1000", "getSolidIris1100", "solidIris1100", "getSolidIris1200", "solidIris1200", "getAlphaRed100", "alphaRed100", "getAlphaRed200", "alphaRed200", "getAlphaRed300", "alphaRed300", "getAlphaRed400", "alphaRed400", "getAlphaRed500", "alphaRed500", "getAlphaRed600", "alphaRed600", "getAlphaRed700", "alphaRed700", "getAlphaRed800", "alphaRed800", "getAlphaRed900", "alphaRed900", "getAlphaRed1000", "alphaRed1000", "getAlphaRed1100", "alphaRed1100", "getAlphaRed1200", "alphaRed1200", "getAlphaBlue100", "alphaBlue100", "getAlphaBlue200", "alphaBlue200", "getAlphaBlue300", "alphaBlue300", "getAlphaBlue400", "alphaBlue400", "getAlphaBlue500", "alphaBlue500", "getAlphaBlue600", "alphaBlue600", "getAlphaBlue700", "alphaBlue700", "getAlphaBlue800", "alphaBlue800", "getAlphaBlue900", "alphaBlue900", "getAlphaBlue1000", "alphaBlue1000", "getAlphaBlue1100", "alphaBlue1100", "getAlphaBlue1200", "alphaBlue1200", "getSolidViolet100", "solidViolet100", "getSolidViolet200", "solidViolet200", "getSolidViolet300", "solidViolet300", "getSolidViolet400", "solidViolet400", "getSolidViolet500", "solidViolet500", "getSolidViolet600", "solidViolet600", "getSolidViolet700", "solidViolet700", "getSolidViolet800", "solidViolet800", "getSolidViolet900", "solidViolet900", "getSolidViolet1000", "solidViolet1000", "getSolidViolet1100", "solidViolet1100", "getSolidViolet1200", "solidViolet1200", "getSolidJade100", "solidJade100", "getSolidJade200", "solidJade200", "getSolidJade300", "solidJade300", "getSolidJade400", "solidJade400", "getSolidJade500", "solidJade500", "getSolidJade600", "solidJade600", "getSolidJade700", "solidJade700", "getSolidJade800", "solidJade800", "getSolidJade900", "solidJade900", "getSolidJade1000", "solidJade1000", "getSolidJade1100", "solidJade1100", "getSolidJade1200", "solidJade1200", "getSolidWhite", "solidWhite", "getSolidBlack", "solidBlack", "getAlphaWhiteAlpha20", "alphaWhiteAlpha20", "getAlphaWhiteAlpha40", "alphaWhiteAlpha40", "getAlphaBlackAlpha20", "alphaBlackAlpha20", "getAlphaBlackAlpha40", "alphaBlackAlpha40", "getAlphaBlackAlpha60", "alphaBlackAlpha60", "getAlphaWhiteAlpha10", "alphaWhiteAlpha10", "getAlphaWhiteAlpha60", "alphaWhiteAlpha60", "getAlphaWhiteAlpha80", "alphaWhiteAlpha80", "getAlphaBlackAlpha80", "alphaBlackAlpha80", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeColorResources {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EchoThemeColorResources INSTANCE = new EchoThemeColorResources();

    public final long getAlphaBlackAlpha20(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlackAlpha20);
    }

    public final long getAlphaBlackAlpha40(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlackAlpha40);
    }

    public final long getAlphaBlackAlpha60(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlackAlpha60);
    }

    public final long getAlphaBlackAlpha80(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlackAlpha80);
    }

    public final long getAlphaBlue100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue100);
    }

    public final long getAlphaBlue1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue1000);
    }

    public final long getAlphaBlue1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue1100);
    }

    public final long getAlphaBlue1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue1200);
    }

    public final long getAlphaBlue200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue200);
    }

    public final long getAlphaBlue300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue300);
    }

    public final long getAlphaBlue400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue400);
    }

    public final long getAlphaBlue500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue500);
    }

    public final long getAlphaBlue600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue600);
    }

    public final long getAlphaBlue700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue700);
    }

    public final long getAlphaBlue800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue800);
    }

    public final long getAlphaBlue900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaBlue900);
    }

    public final long getAlphaGray100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray100);
    }

    public final long getAlphaGray1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray1000);
    }

    public final long getAlphaGray1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray1100);
    }

    public final long getAlphaGray1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray1200);
    }

    public final long getAlphaGray200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray200);
    }

    public final long getAlphaGray300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray300);
    }

    public final long getAlphaGray400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray400);
    }

    public final long getAlphaGray500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray500);
    }

    public final long getAlphaGray600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray600);
    }

    public final long getAlphaGray700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray700);
    }

    public final long getAlphaGray800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray800);
    }

    public final long getAlphaGray900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaGray900);
    }

    public final long getAlphaRed100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed100);
    }

    public final long getAlphaRed1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed1000);
    }

    public final long getAlphaRed1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed1100);
    }

    public final long getAlphaRed1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed1200);
    }

    public final long getAlphaRed200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed200);
    }

    public final long getAlphaRed300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed300);
    }

    public final long getAlphaRed400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed400);
    }

    public final long getAlphaRed500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed500);
    }

    public final long getAlphaRed600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed600);
    }

    public final long getAlphaRed700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed700);
    }

    public final long getAlphaRed800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed800);
    }

    public final long getAlphaRed900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaRed900);
    }

    public final long getAlphaWhiteAlpha10(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaWhiteAlpha10);
    }

    public final long getAlphaWhiteAlpha20(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaWhiteAlpha20);
    }

    public final long getAlphaWhiteAlpha40(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaWhiteAlpha40);
    }

    public final long getAlphaWhiteAlpha60(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaWhiteAlpha60);
    }

    public final long getAlphaWhiteAlpha80(m mVar, int i10) {
        return a.f(mVar, R.color.echo_alphaWhiteAlpha80);
    }

    public final long getSolidAmber100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber100);
    }

    public final long getSolidAmber1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber1000);
    }

    public final long getSolidAmber1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber1100);
    }

    public final long getSolidAmber1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber1200);
    }

    public final long getSolidAmber200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber200);
    }

    public final long getSolidAmber300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber300);
    }

    public final long getSolidAmber400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber400);
    }

    public final long getSolidAmber500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber500);
    }

    public final long getSolidAmber600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber600);
    }

    public final long getSolidAmber700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber700);
    }

    public final long getSolidAmber800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber800);
    }

    public final long getSolidAmber900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidAmber900);
    }

    public final long getSolidBlack(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlack);
    }

    public final long getSolidBlue100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue100);
    }

    public final long getSolidBlue1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue1000);
    }

    public final long getSolidBlue1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue1100);
    }

    public final long getSolidBlue1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue1200);
    }

    public final long getSolidBlue200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue200);
    }

    public final long getSolidBlue300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue300);
    }

    public final long getSolidBlue400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue400);
    }

    public final long getSolidBlue500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue500);
    }

    public final long getSolidBlue600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue600);
    }

    public final long getSolidBlue700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue700);
    }

    public final long getSolidBlue800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue800);
    }

    public final long getSolidBlue900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidBlue900);
    }

    public final long getSolidGray100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray100);
    }

    public final long getSolidGray1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray1000);
    }

    public final long getSolidGray1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray1100);
    }

    public final long getSolidGray1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray1200);
    }

    public final long getSolidGray200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray200);
    }

    public final long getSolidGray300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray300);
    }

    public final long getSolidGray400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray400);
    }

    public final long getSolidGray500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray500);
    }

    public final long getSolidGray600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray600);
    }

    public final long getSolidGray700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray700);
    }

    public final long getSolidGray800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray800);
    }

    public final long getSolidGray900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidGray900);
    }

    public final long getSolidIris100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris100);
    }

    public final long getSolidIris1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris1000);
    }

    public final long getSolidIris1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris1100);
    }

    public final long getSolidIris1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris1200);
    }

    public final long getSolidIris200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris200);
    }

    public final long getSolidIris300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris300);
    }

    public final long getSolidIris400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris400);
    }

    public final long getSolidIris500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris500);
    }

    public final long getSolidIris600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris600);
    }

    public final long getSolidIris700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris700);
    }

    public final long getSolidIris800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris800);
    }

    public final long getSolidIris900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidIris900);
    }

    public final long getSolidJade100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade100);
    }

    public final long getSolidJade1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade1000);
    }

    public final long getSolidJade1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade1100);
    }

    public final long getSolidJade1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade1200);
    }

    public final long getSolidJade200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade200);
    }

    public final long getSolidJade300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade300);
    }

    public final long getSolidJade400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade400);
    }

    public final long getSolidJade500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade500);
    }

    public final long getSolidJade600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade600);
    }

    public final long getSolidJade700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade700);
    }

    public final long getSolidJade800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade800);
    }

    public final long getSolidJade900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidJade900);
    }

    public final long getSolidRed100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed100);
    }

    public final long getSolidRed1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed1000);
    }

    public final long getSolidRed1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed1100);
    }

    public final long getSolidRed1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed1200);
    }

    public final long getSolidRed200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed200);
    }

    public final long getSolidRed300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed300);
    }

    public final long getSolidRed400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed400);
    }

    public final long getSolidRed500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed500);
    }

    public final long getSolidRed600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed600);
    }

    public final long getSolidRed700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed700);
    }

    public final long getSolidRed800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed800);
    }

    public final long getSolidRed900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidRed900);
    }

    public final long getSolidViolet100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet100);
    }

    public final long getSolidViolet1000(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet1000);
    }

    public final long getSolidViolet1100(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet1100);
    }

    public final long getSolidViolet1200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet1200);
    }

    public final long getSolidViolet200(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet200);
    }

    public final long getSolidViolet300(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet300);
    }

    public final long getSolidViolet400(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet400);
    }

    public final long getSolidViolet500(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet500);
    }

    public final long getSolidViolet600(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet600);
    }

    public final long getSolidViolet700(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet700);
    }

    public final long getSolidViolet800(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet800);
    }

    public final long getSolidViolet900(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidViolet900);
    }

    public final long getSolidWhite(m mVar, int i10) {
        return a.f(mVar, R.color.echo_solidWhite);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColorResources$Companion;", "", "<init>", "()V", "INSTANCE", "Lio/elevenlabs/ui/echo/EchoThemeColorResources;", "getINSTANCE", "()Lio/elevenlabs/ui/echo/EchoThemeColorResources;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EchoThemeColorResources getINSTANCE() {
            return EchoThemeColorResources.INSTANCE;
        }

        private Companion() {
        }
    }
}
